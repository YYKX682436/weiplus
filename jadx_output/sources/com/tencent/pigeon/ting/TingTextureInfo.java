package com.tencent.pigeon.ting;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/tencent/pigeon/ting/TingTextureInfo;", "", "textureId", "", "textureWidth", "textureHeight", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getTextureHeight", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTextureId", "getTextureWidth", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/tencent/pigeon/ting/TingTextureInfo;", "equals", "", "other", "hashCode", "", "toList", "", "toString", "", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TingTextureInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ting.TingTextureInfo.Companion INSTANCE = new com.tencent.pigeon.ting.TingTextureInfo.Companion(null);
    private final java.lang.Long textureHeight;
    private final java.lang.Long textureId;
    private final java.lang.Long textureWidth;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/TingTextureInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ting/TingTextureInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ting.TingTextureInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            java.lang.Long valueOf = obj instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj).intValue()) : (java.lang.Long) obj;
            java.lang.Object obj2 = list.get(1);
            java.lang.Long valueOf2 = obj2 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj2).intValue()) : (java.lang.Long) obj2;
            java.lang.Object obj3 = list.get(2);
            return new com.tencent.pigeon.ting.TingTextureInfo(valueOf, valueOf2, obj3 instanceof java.lang.Integer ? java.lang.Long.valueOf(((java.lang.Number) obj3).intValue()) : (java.lang.Long) obj3);
        }
    }

    public TingTextureInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ com.tencent.pigeon.ting.TingTextureInfo copy$default(com.tencent.pigeon.ting.TingTextureInfo tingTextureInfo, java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            l17 = tingTextureInfo.textureId;
        }
        if ((i17 & 2) != 0) {
            l18 = tingTextureInfo.textureWidth;
        }
        if ((i17 & 4) != 0) {
            l19 = tingTextureInfo.textureHeight;
        }
        return tingTextureInfo.copy(l17, l18, l19);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Long getTextureId() {
        return this.textureId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Long getTextureWidth() {
        return this.textureWidth;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Long getTextureHeight() {
        return this.textureHeight;
    }

    public final com.tencent.pigeon.ting.TingTextureInfo copy(java.lang.Long textureId, java.lang.Long textureWidth, java.lang.Long textureHeight) {
        return new com.tencent.pigeon.ting.TingTextureInfo(textureId, textureWidth, textureHeight);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ting.TingTextureInfo)) {
            return false;
        }
        com.tencent.pigeon.ting.TingTextureInfo tingTextureInfo = (com.tencent.pigeon.ting.TingTextureInfo) other;
        return kotlin.jvm.internal.o.b(this.textureId, tingTextureInfo.textureId) && kotlin.jvm.internal.o.b(this.textureWidth, tingTextureInfo.textureWidth) && kotlin.jvm.internal.o.b(this.textureHeight, tingTextureInfo.textureHeight);
    }

    public final java.lang.Long getTextureHeight() {
        return this.textureHeight;
    }

    public final java.lang.Long getTextureId() {
        return this.textureId;
    }

    public final java.lang.Long getTextureWidth() {
        return this.textureWidth;
    }

    public int hashCode() {
        java.lang.Long l17 = this.textureId;
        int hashCode = (l17 == null ? 0 : l17.hashCode()) * 31;
        java.lang.Long l18 = this.textureWidth;
        int hashCode2 = (hashCode + (l18 == null ? 0 : l18.hashCode())) * 31;
        java.lang.Long l19 = this.textureHeight;
        return hashCode2 + (l19 != null ? l19.hashCode() : 0);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.textureId, this.textureWidth, this.textureHeight);
    }

    public java.lang.String toString() {
        return "TingTextureInfo(textureId=" + this.textureId + ", textureWidth=" + this.textureWidth + ", textureHeight=" + this.textureHeight + ')';
    }

    public TingTextureInfo(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19) {
        this.textureId = l17;
        this.textureWidth = l18;
        this.textureHeight = l19;
    }

    public /* synthetic */ TingTextureInfo(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : l17, (i17 & 2) != 0 ? null : l18, (i17 & 4) != 0 ? null : l19);
    }
}
