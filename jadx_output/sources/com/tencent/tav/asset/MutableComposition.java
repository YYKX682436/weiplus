package com.tencent.tav.asset;

/* loaded from: classes16.dex */
public class MutableComposition extends com.tencent.tav.asset.Composition<com.tencent.tav.asset.MutableCompositionTrack> {
    public MutableComposition() {
        setNaturalSize(new com.tencent.tav.coremedia.CGSize(0.0f, 0.0f));
    }

    private int getCorrectTrackID(int i17) {
        boolean z17;
        java.util.Iterator it = ((com.tencent.tav.asset.Composition) this).tracks.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            if (((com.tencent.tav.asset.MutableCompositionTrack) it.next()).getTrackID() == i17) {
                z17 = true;
                break;
            }
        }
        if (!z17 && i17 > 0) {
            return i17;
        }
        if (i17 == -1) {
            int i18 = this.trackIndex;
            this.trackIndex = i18 + 1;
            return i18;
        }
        int i19 = this.trackIndex;
        if (i19 >= i17) {
            this.trackIndex = i19 + 1;
            return i19;
        }
        this.trackIndex = i17;
        return i17;
    }

    public com.tencent.tav.asset.MutableCompositionTrack addMutableTrackWithMediaType(int i17, int i18) {
        com.tencent.tav.asset.MutableCompositionTrack mutableCompositionTrack = new com.tencent.tav.asset.MutableCompositionTrack(i17, getCorrectTrackID(i18));
        mutableCompositionTrack.setNaturalSize(getNaturalSize());
        ((com.tencent.tav.asset.Composition) this).tracks.add(mutableCompositionTrack);
        this.trackCount++;
        return mutableCompositionTrack;
    }

    @Override // com.tencent.tav.asset.Asset
    public com.tencent.tav.coremedia.CGSize getNaturalSize() {
        if (this.naturalSize.equals(com.tencent.tav.coremedia.CGSize.CGSizeZero)) {
            for (CTrack ctrack : ((com.tencent.tav.asset.Composition) this).tracks) {
                if (ctrack.enabled) {
                    return ctrack.getNaturalSize();
                }
            }
        }
        return this.naturalSize;
    }

    @Override // com.tencent.tav.asset.Asset
    public int getPreferRotation() {
        if (this.preferRotation == 0) {
            for (CTrack ctrack : ((com.tencent.tav.asset.Composition) this).tracks) {
                if (ctrack.enabled) {
                    return ctrack.getPreferredRotation();
                }
            }
        }
        return this.preferRotation;
    }

    @Override // com.tencent.tav.asset.Composition, com.tencent.tav.asset.Asset
    public java.util.List<com.tencent.tav.asset.MutableCompositionTrack> getTracks() {
        java.util.Objects.toString(((com.tencent.tav.asset.Composition) this).tracks);
        return ((com.tencent.tav.asset.Composition) this).tracks;
    }

    public void insertEmptyTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        java.util.Iterator it = ((com.tencent.tav.asset.Composition) this).tracks.iterator();
        while (it.hasNext()) {
            ((com.tencent.tav.asset.MutableCompositionTrack) it.next()).insertEmptyTimeRange(cMTimeRange);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        if (r4 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        r4 = r3.getMediaType();
        r5 = r9.trackIndex;
        r9.trackIndex = r5 + 1;
        r4 = addMutableTrackWithMediaType(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r4.insertTimeRange(r10, r3, r12) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
    
        r0.add(java.lang.Integer.valueOf(r4.getTrackID()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean insertTimeRange(com.tencent.tav.coremedia.CMTimeRange r10, com.tencent.tav.asset.Asset r11, com.tencent.tav.coremedia.CMTime r12) {
        /*
            r9 = this;
            com.tencent.tav.coremedia.CMTime r0 = r10.getDuration()
            long r0 = r0.value
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto Laa
            if (r11 == 0) goto Laa
            int r0 = r11.getTrackCount()
            if (r0 != 0) goto L17
            goto Laa
        L17:
            java.util.List r11 = r11.getTracks()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = r1
        L21:
            int r3 = r11.size()
            r4 = 1
            if (r2 >= r3) goto L85
            java.lang.Object r3 = r11.get(r2)
            com.tencent.tav.asset.AssetTrack r3 = (com.tencent.tav.asset.AssetTrack) r3
            r5 = r2
        L2f:
            java.util.List<CTrack extends com.tencent.tav.asset.CompositionTrack> r6 = r9.tracks
            int r6 = r6.size()
            if (r5 >= r6) goto L5f
            java.util.List<CTrack extends com.tencent.tav.asset.CompositionTrack> r6 = r9.tracks
            java.lang.Object r6 = r6.get(r5)
            com.tencent.tav.asset.MutableCompositionTrack r6 = (com.tencent.tav.asset.MutableCompositionTrack) r6
            int r7 = r6.getMediaType()
            int r8 = r3.getMediaType()
            if (r7 != r8) goto L5c
            boolean r5 = r6.insertTimeRange(r10, r3, r12)
            if (r5 != 0) goto L50
            return r1
        L50:
            int r5 = r6.getTrackID()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
            goto L60
        L5c:
            int r5 = r5 + 1
            goto L2f
        L5f:
            r4 = r1
        L60:
            if (r4 != 0) goto L82
            int r4 = r3.getMediaType()
            int r5 = r9.trackIndex
            int r6 = r5 + 1
            r9.trackIndex = r6
            com.tencent.tav.asset.MutableCompositionTrack r4 = r9.addMutableTrackWithMediaType(r4, r5)
            boolean r3 = r4.insertTimeRange(r10, r3, r12)
            if (r3 != 0) goto L77
            return r1
        L77:
            int r3 = r4.getTrackID()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
        L82:
            int r2 = r2 + 1
            goto L21
        L85:
            java.util.List<CTrack extends com.tencent.tav.asset.CompositionTrack> r11 = r9.tracks
            java.util.Iterator r11 = r11.iterator()
        L8b:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto La9
            java.lang.Object r12 = r11.next()
            com.tencent.tav.asset.MutableCompositionTrack r12 = (com.tencent.tav.asset.MutableCompositionTrack) r12
            int r1 = r12.getTrackID()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L8b
            r12.insertEmptyTimeRange(r10)
            goto L8b
        La9:
            return r4
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.asset.MutableComposition.insertTimeRange(com.tencent.tav.coremedia.CMTimeRange, com.tencent.tav.asset.Asset, com.tencent.tav.coremedia.CMTime):boolean");
    }

    public com.tencent.tav.asset.MutableCompositionTrack mutableTrackCompatibleWithTrack(com.tencent.tav.asset.AssetTrack assetTrack) {
        if (assetTrack == null || assetTrack.getAsset() == null) {
            return null;
        }
        com.tencent.tav.asset.MutableCompositionTrack mutableCompositionTrack = new com.tencent.tav.asset.MutableCompositionTrack(assetTrack.getMediaType(), getCorrectTrackID(-1));
        mutableCompositionTrack.insertTimeRange(assetTrack.getTimeRange(), assetTrack, com.tencent.tav.coremedia.CMTime.CMTimeZero);
        mutableCompositionTrack.setPreferredTransform(assetTrack.getPreferredTransform());
        mutableCompositionTrack.setPreferredRotation(assetTrack.getPreferredRotation());
        mutableCompositionTrack.setPreferredVolume(assetTrack.getPreferredVolume());
        return mutableCompositionTrack;
    }

    public void removeTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        java.util.Iterator it = ((com.tencent.tav.asset.Composition) this).tracks.iterator();
        while (it.hasNext()) {
            ((com.tencent.tav.asset.MutableCompositionTrack) it.next()).removeTimeRange(cMTimeRange);
        }
    }

    public void removeTrack(com.tencent.tav.asset.CompositionTrack compositionTrack) {
        int i17 = 0;
        while (i17 < ((com.tencent.tav.asset.Composition) this).tracks.size()) {
            if (((com.tencent.tav.asset.MutableCompositionTrack) ((com.tencent.tav.asset.Composition) this).tracks.get(i17)) == compositionTrack) {
                ((com.tencent.tav.asset.Composition) this).tracks.remove(i17);
                i17--;
            }
            i17++;
        }
    }

    public void scaleTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTime cMTime) {
        java.util.Iterator it = ((com.tencent.tav.asset.Composition) this).tracks.iterator();
        while (it.hasNext()) {
            ((com.tencent.tav.asset.MutableCompositionTrack) it.next()).scaleTimeRange(cMTimeRange, cMTime);
        }
    }

    public void setNaturalSize(com.tencent.tav.coremedia.CGSize cGSize) {
        this.naturalSize = cGSize;
        for (CTrack ctrack : ((com.tencent.tav.asset.Composition) this).tracks) {
            if (ctrack != null && ctrack.getMediaType() == 1 && ctrack.getNaturalSize() == null) {
                ctrack.setNaturalSize(cGSize);
            }
        }
    }

    public void setPreferRotation(int i17) {
        this.preferRotation = i17;
    }

    public void setPreferredVolume(float f17) {
        this.preferredVolume = f17;
    }

    @Override // com.tencent.tav.asset.Asset
    public java.util.List<com.tencent.tav.asset.MutableCompositionTrack> tracksWithMediaType(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (CTrack ctrack : ((com.tencent.tav.asset.Composition) this).tracks) {
            if (ctrack != null && ctrack.getMediaType() == i17) {
                arrayList.add(ctrack);
            }
        }
        return arrayList;
    }

    @Override // com.tencent.tav.asset.Asset
    public com.tencent.tav.asset.MutableCompositionTrack trackWithTrackID(int i17) {
        for (CTrack ctrack : ((com.tencent.tav.asset.Composition) this).tracks) {
            if (ctrack != null && ctrack.getTrackID() == i17) {
                return ctrack;
            }
        }
        return null;
    }
}
