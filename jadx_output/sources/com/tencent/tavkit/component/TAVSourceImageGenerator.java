package com.tencent.tavkit.component;

/* loaded from: classes10.dex */
public class TAVSourceImageGenerator {
    public static final java.lang.String TAG = "TAVSourceImageGenerator";
    private com.tencent.tav.core.AssetImageGenerator assetImageGenerator;

    public TAVSourceImageGenerator(com.tencent.tavkit.composition.TAVComposition tAVComposition, com.tencent.tav.coremedia.CGSize cGSize) {
        init(new com.tencent.tavkit.composition.builder.TAVCompositionBuilder(tAVComposition).buildSource(), cGSize);
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r6 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void checkRequestedTimes(java.util.List<com.tencent.tav.coremedia.CMTime> r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L7:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L12
            com.tencent.tav.coremedia.CMTime r0 = com.tencent.tav.coremedia.CMTime.CMTimeZero
            r6.add(r0)
        L12:
            r0 = 0
        L13:
            int r1 = r6.size()
            if (r0 >= r1) goto L33
            java.lang.Object r1 = r6.get(r0)
            com.tencent.tav.coremedia.CMTime r1 = (com.tencent.tav.coremedia.CMTime) r1
            if (r1 == 0) goto L2b
            long r1 = r1.getTimeUs()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L30
        L2b:
            com.tencent.tav.coremedia.CMTime r1 = com.tencent.tav.coremedia.CMTime.CMTimeZero
            r6.set(r0, r1)
        L30:
            int r0 = r0 + 1
            goto L13
        L33:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            java.util.Iterator r1 = r6.iterator()
        L40:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r2 = r1.next()
            com.tencent.tav.coremedia.CMTime r2 = (com.tencent.tav.coremedia.CMTime) r2
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L40
            r0.add(r2)
            goto L40
        L56:
            r6.clear()
            r6.addAll(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tavkit.component.TAVSourceImageGenerator.checkRequestedTimes(java.util.List):void");
    }

    private void init(com.tencent.tavkit.composition.TAVSource tAVSource, com.tencent.tav.coremedia.CGSize cGSize) {
        com.tencent.tav.core.AssetImageGenerator assetImageGenerator = new com.tencent.tav.core.AssetImageGenerator(tAVSource.getAsset());
        this.assetImageGenerator = assetImageGenerator;
        assetImageGenerator.setMaximumSize(cGSize);
        this.assetImageGenerator.setAppliesPreferredTrackTransform(true);
        this.assetImageGenerator.setVideoComposition(tAVSource.getVideoComposition());
    }

    public void generateThumbnailAtTime(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.core.AssetImageGenerator.ImageGeneratorListener imageGeneratorListener) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (cMTime == null || cMTime.getTimeUs() < 0) {
            cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        }
        arrayList.add(cMTime);
        generateThumbnailAtTimes(arrayList, imageGeneratorListener);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000f, code lost:
    
        if (r7.getTimeUs() < 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap generateThumbnailAtTimeSync(com.tencent.tav.coremedia.CMTime r7) {
        /*
            r6 = this;
            com.tencent.tav.core.AssetImageGenerator r0 = r6.assetImageGenerator
            r1 = 0
            if (r0 == 0) goto L21
            if (r7 == 0) goto L11
            long r2 = r7.getTimeUs()     // Catch: java.lang.Exception -> L1a
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L13
        L11:
            com.tencent.tav.coremedia.CMTime r7 = com.tencent.tav.coremedia.CMTime.CMTimeZero     // Catch: java.lang.Exception -> L1a
        L13:
            com.tencent.tav.core.AssetImageGenerator r0 = r6.assetImageGenerator     // Catch: java.lang.Exception -> L1a
            android.graphics.Bitmap r1 = r0.copyCGImageAtTimeAndActualTime(r7, r1)     // Catch: java.lang.Exception -> L1a
            goto L21
        L1a:
            r7 = move-exception
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r7)
            throw r0
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tavkit.component.TAVSourceImageGenerator.generateThumbnailAtTimeSync(com.tencent.tav.coremedia.CMTime):android.graphics.Bitmap");
    }

    public synchronized void generateThumbnailAtTimes(java.util.List<com.tencent.tav.coremedia.CMTime> list, final com.tencent.tav.core.AssetImageGenerator.ImageGeneratorListener imageGeneratorListener) {
        checkRequestedTimes(list);
        if (!list.isEmpty()) {
            com.tencent.tav.core.AssetImageGenerator assetImageGenerator = this.assetImageGenerator;
            if (assetImageGenerator == null) {
            } else {
                assetImageGenerator.generateCGImagesAsynchronouslyForTimes(list, new com.tencent.tav.core.AssetImageGenerator.ImageGeneratorListener() { // from class: com.tencent.tavkit.component.TAVSourceImageGenerator.1
                    @Override // com.tencent.tav.core.AssetImageGenerator.ImageGeneratorListener
                    public void onCompletion(com.tencent.tav.coremedia.CMTime cMTime, android.graphics.Bitmap bitmap, com.tencent.tav.coremedia.CMTime cMTime2, com.tencent.tav.core.AssetImageGenerator.AssetImageGeneratorResult assetImageGeneratorResult) {
                        imageGeneratorListener.onCompletion(cMTime, bitmap, cMTime2, assetImageGeneratorResult);
                    }
                });
            }
        }
    }

    public com.tencent.tav.core.AssetImageGenerator getAssetImageGenerator() {
        return this.assetImageGenerator;
    }

    public TAVSourceImageGenerator(com.tencent.tavkit.composition.TAVSource tAVSource, com.tencent.tav.coremedia.CGSize cGSize) {
        init(tAVSource, cGSize);
    }
}
