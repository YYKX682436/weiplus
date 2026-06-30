package com.tencent.tavkit.composition.builder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class VideoInstructionsBuilder {
    private final com.tencent.tavkit.composition.builder.BuilderModel builderModel;
    private final java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionInstruction> outputInstructions = new java.util.ArrayList();

    /* loaded from: classes16.dex */
    public static class Slice {
        private java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction> layerInstructions;
        private com.tencent.tav.coremedia.CMTimeRange timeRange;

        public Slice(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction> list) {
            this.timeRange = cMTimeRange;
            this.layerInstructions = list;
        }
    }

    public VideoInstructionsBuilder(com.tencent.tavkit.composition.builder.BuilderModel builderModel) {
        this.builderModel = builderModel;
    }

    private com.tencent.tavkit.composition.video.TAVVideoCompositionInstruction buildInstruction(com.tencent.tavkit.composition.builder.VideoInstructionsBuilder.Slice slice, java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction> list, java.util.List<java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction>> list2) {
        com.tencent.tavkit.composition.video.TAVVideoCompositionInstruction tAVVideoCompositionInstruction = new com.tencent.tavkit.composition.video.TAVVideoCompositionInstruction(trackIDsByLayers(slice.layerInstructions), slice.timeRange);
        tAVVideoCompositionInstruction.setChannelLayers(selectChannels(list2, slice.layerInstructions));
        tAVVideoCompositionInstruction.setOverlayLayers(selectLayers(list, slice.layerInstructions));
        tAVVideoCompositionInstruction.setBackgroundColor(this.builderModel.getBackgroundColor());
        tAVVideoCompositionInstruction.setGlobalVideoEffect(this.builderModel.getTavComposition().getGlobalVideoEffect());
        tAVVideoCompositionInstruction.setVideoMixEffect(this.builderModel.getTavComposition().getVideoMixEffect());
        tAVVideoCompositionInstruction.setSourceVideoEffect(this.builderModel.getTavComposition().getSourceVideoEffect());
        return tAVVideoCompositionInstruction;
    }

    private void buildInstructions(java.util.List<java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction>> list, java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction> list2, java.util.List<com.tencent.tavkit.composition.builder.VideoInstructionsBuilder.Slice> list3) {
        java.util.Iterator<com.tencent.tavkit.composition.builder.VideoInstructionsBuilder.Slice> it = list3.iterator();
        while (it.hasNext()) {
            this.outputInstructions.add(buildInstruction(it.next(), list2, list));
        }
    }

    private static java.util.List<com.tencent.tavkit.composition.builder.VideoInstructionsBuilder.Slice> calculateSlicesForLayerInstructions(java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction> list) {
        java.util.TreeSet treeSet = new java.util.TreeSet(new java.util.Comparator<com.tencent.tav.coremedia.CMTime>() { // from class: com.tencent.tavkit.composition.builder.VideoInstructionsBuilder.1
            @Override // java.util.Comparator
            public int compare(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CMTime cMTime2) {
                return (int) cMTime.sub(cMTime2).getValue();
            }
        });
        for (com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction tAVVideoCompositionLayerInstruction : list) {
            treeSet.add(tAVVideoCompositionLayerInstruction.getTimeRange().getStart());
            treeSet.add(tAVVideoCompositionLayerInstruction.getTimeRange().getEnd());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.tav.coremedia.CMTime cMTime = (com.tencent.tav.coremedia.CMTime) treeSet.pollFirst();
        java.util.Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            com.tencent.tav.coremedia.CMTime cMTime2 = (com.tencent.tav.coremedia.CMTime) it.next();
            com.tencent.tav.coremedia.CMTimeRange cMTimeRange = new com.tencent.tav.coremedia.CMTimeRange(cMTime, cMTime2.sub(cMTime));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction tAVVideoCompositionLayerInstruction2 : list) {
                if (tAVVideoCompositionLayerInstruction2.getTimeRange().getEnd().getTimeUs() >= cMTime.getTimeUs() && tAVVideoCompositionLayerInstruction2.getTimeRange().getStart().getTimeUs() <= cMTime2.getTimeUs()) {
                    arrayList2.add(tAVVideoCompositionLayerInstruction2);
                }
            }
            arrayList.add(new com.tencent.tavkit.composition.builder.VideoInstructionsBuilder.Slice(cMTimeRange, arrayList2));
            cMTime = cMTime2;
        }
        return arrayList;
    }

    private java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction> concatAndSortLayers(java.util.List<java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction>> list, java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction> list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next());
        }
        arrayList.addAll(list2);
        java.util.Collections.sort(arrayList, new java.util.Comparator<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction>() { // from class: com.tencent.tavkit.composition.builder.VideoInstructionsBuilder.2
            @Override // java.util.Comparator
            public int compare(com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction tAVVideoCompositionLayerInstruction, com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction tAVVideoCompositionLayerInstruction2) {
                com.tencent.tav.coremedia.CMTime start = tAVVideoCompositionLayerInstruction.getTimeRange().getStart();
                com.tencent.tav.coremedia.CMTime start2 = tAVVideoCompositionLayerInstruction2.getTimeRange().getStart();
                if (start.equalsTo(start2)) {
                    return 0;
                }
                return start.smallThan(start2) ? -1 : 1;
            }
        });
        return arrayList;
    }

    private void fixLastLayerDuration(java.util.List<java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction>> list) {
        java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction> list2;
        if (list == null || list.size() != 1 || (list2 = list.get(0)) == null || list2.isEmpty()) {
            return;
        }
        com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction tAVVideoCompositionLayerInstruction = list2.get(list2.size() - 1);
        com.tencent.tav.coremedia.CMTime frameDuration = this.builderModel.getTavComposition().getFrameDuration();
        if (frameDuration == null) {
            frameDuration = new com.tencent.tav.coremedia.CMTime(1L, 30);
        }
        tAVVideoCompositionLayerInstruction.setTimeRange(new com.tencent.tav.coremedia.CMTimeRange(tAVVideoCompositionLayerInstruction.getTimeRange().getStart(), tAVVideoCompositionLayerInstruction.getTimeRange().getDuration().add(frameDuration)));
    }

    private java.util.List<java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction>> selectChannels(java.util.List<java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction>> list, java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction> list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction>> it = list.iterator();
        while (it.hasNext()) {
            java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction> selectLayers = selectLayers(list2, it.next());
            if (selectLayers.size() > 0) {
                arrayList.add(selectLayers);
            }
        }
        return arrayList;
    }

    private java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction> selectLayers(java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction> list, java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction> list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction tAVVideoCompositionLayerInstruction : list) {
            if (list2.contains(tAVVideoCompositionLayerInstruction)) {
                arrayList.add(tAVVideoCompositionLayerInstruction);
            }
        }
        return arrayList;
    }

    private java.util.List<java.lang.Integer> trackIDsByLayers(java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(it.next().getTrackID()));
        }
        return arrayList;
    }

    public java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionInstruction> build() {
        java.util.List<java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction>> buildMainLayerInstructions = buildMainLayerInstructions();
        java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction> buildOverlayLayerInstructions = buildOverlayLayerInstructions();
        buildInstructions(buildMainLayerInstructions, buildOverlayLayerInstructions, calculateSlicesForLayerInstructions(concatAndSortLayers(buildMainLayerInstructions, buildOverlayLayerInstructions)));
        return this.outputInstructions;
    }

    public java.util.List<java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction>> buildMainLayerInstructions() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.List<com.tencent.tavkit.composition.builder.VideoInfo> list : this.builderModel.getMainVideoTrackInfo()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.tencent.tavkit.composition.builder.VideoInfo videoInfo : list) {
                arrayList2.add(new com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction(videoInfo.compositionTrack.getTrackID(), videoInfo.clip));
            }
            arrayList.add(arrayList2);
        }
        fixLastLayerDuration(arrayList);
        return arrayList;
    }

    public java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction> buildOverlayLayerInstructions() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.tencent.tavkit.composition.builder.VideoOverlayInfo> it = this.builderModel.getOverlayTrackInfo().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().convertToLayerInstruction());
        }
        return arrayList;
    }
}
