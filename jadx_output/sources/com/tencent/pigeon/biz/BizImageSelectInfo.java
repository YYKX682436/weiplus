package com.tencent.pigeon.biz;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB=\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u0013\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJF\u0010\u0015\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\r¨\u0006 "}, d2 = {"Lcom/tencent/pigeon/biz/BizImageSelectInfo;", "", "imgList", "", "Lcom/tencent/pigeon/biz/BizSelectPhotoInfo;", "ratioW", "", "ratioH", "picFromScene", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getImgList", "()Ljava/util/List;", "getPicFromScene", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRatioH", "getRatioW", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/tencent/pigeon/biz/BizImageSelectInfo;", "equals", "", "other", "hashCode", "", "toList", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BizImageSelectInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz.BizImageSelectInfo.Companion INSTANCE = new com.tencent.pigeon.biz.BizImageSelectInfo.Companion(null);
    private final java.util.List<com.tencent.pigeon.biz.BizSelectPhotoInfo> imgList;
    private final java.lang.Long picFromScene;
    private final java.lang.Long ratioH;
    private final java.lang.Long ratioW;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz/BizImageSelectInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz/BizImageSelectInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz.BizImageSelectInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.util.List list2 = (java.util.List) list.get(0);
            java.lang.Object obj = list.get(1);
            java.lang.Long valueOf = obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj;
            java.lang.Object obj2 = list.get(2);
            java.lang.Long valueOf2 = obj2 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj2).intValue()) : (java.lang.Long) obj2;
            java.lang.Object obj3 = list.get(3);
            return new com.tencent.pigeon.biz.BizImageSelectInfo(list2, valueOf, valueOf2, obj3 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj3).intValue()) : (java.lang.Long) obj3);
        }
    }

    public BizImageSelectInfo() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.tencent.pigeon.biz.BizImageSelectInfo copy$default(com.tencent.pigeon.biz.BizImageSelectInfo bizImageSelectInfo, java.util.List list, java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            list = bizImageSelectInfo.imgList;
        }
        if ((i17 & 2) != 0) {
            l17 = bizImageSelectInfo.ratioW;
        }
        if ((i17 & 4) != 0) {
            l18 = bizImageSelectInfo.ratioH;
        }
        if ((i17 & 8) != 0) {
            l19 = bizImageSelectInfo.picFromScene;
        }
        return bizImageSelectInfo.copy(list, l17, l18, l19);
    }

    public final java.util.List<com.tencent.pigeon.biz.BizSelectPhotoInfo> component1() {
        return this.imgList;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Long getRatioW() {
        return this.ratioW;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Long getRatioH() {
        return this.ratioH;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Long getPicFromScene() {
        return this.picFromScene;
    }

    public final com.tencent.pigeon.biz.BizImageSelectInfo copy(java.util.List<com.tencent.pigeon.biz.BizSelectPhotoInfo> imgList, java.lang.Long ratioW, java.lang.Long ratioH, java.lang.Long picFromScene) {
        return new com.tencent.pigeon.biz.BizImageSelectInfo(imgList, ratioW, ratioH, picFromScene);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz.BizImageSelectInfo)) {
            return false;
        }
        com.tencent.pigeon.biz.BizImageSelectInfo bizImageSelectInfo = (com.tencent.pigeon.biz.BizImageSelectInfo) other;
        return kotlin.jvm.internal.o.b(this.imgList, bizImageSelectInfo.imgList) && kotlin.jvm.internal.o.b(this.ratioW, bizImageSelectInfo.ratioW) && kotlin.jvm.internal.o.b(this.ratioH, bizImageSelectInfo.ratioH) && kotlin.jvm.internal.o.b(this.picFromScene, bizImageSelectInfo.picFromScene);
    }

    public final java.util.List<com.tencent.pigeon.biz.BizSelectPhotoInfo> getImgList() {
        return this.imgList;
    }

    public final java.lang.Long getPicFromScene() {
        return this.picFromScene;
    }

    public final java.lang.Long getRatioH() {
        return this.ratioH;
    }

    public final java.lang.Long getRatioW() {
        return this.ratioW;
    }

    public int hashCode() {
        java.util.List<com.tencent.pigeon.biz.BizSelectPhotoInfo> list = this.imgList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        java.lang.Long l17 = this.ratioW;
        int hashCode2 = (hashCode + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.Long l18 = this.ratioH;
        int hashCode3 = (hashCode2 + (l18 == null ? 0 : l18.hashCode())) * 31;
        java.lang.Long l19 = this.picFromScene;
        return hashCode3 + (l19 != null ? l19.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.imgList, this.ratioW, this.ratioH, this.picFromScene);
    }

    public java.lang.String toString() {
        return "BizImageSelectInfo(imgList=" + this.imgList + ", ratioW=" + this.ratioW + ", ratioH=" + this.ratioH + ", picFromScene=" + this.picFromScene + ')';
    }

    public BizImageSelectInfo(java.util.List<com.tencent.pigeon.biz.BizSelectPhotoInfo> list, java.lang.Long l17, java.lang.Long l18, java.lang.Long l19) {
        this.imgList = list;
        this.ratioW = l17;
        this.ratioH = l18;
        this.picFromScene = l19;
    }

    public /* synthetic */ BizImageSelectInfo(java.util.List list, java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : list, (i17 & 2) != 0 ? null : l17, (i17 & 4) != 0 ? null : l18, (i17 & 8) != 0 ? null : l19);
    }
}
