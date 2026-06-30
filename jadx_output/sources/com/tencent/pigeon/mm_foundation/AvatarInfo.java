package com.tencent.pigeon.mm_foundation;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/AvatarInfo;", "", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "", "loadInfo", "Lcom/tencent/pigeon/mm_foundation/ImageLoadPerformanceInfo;", "(Ljava/lang/String;Lcom/tencent/pigeon/mm_foundation/ImageLoadPerformanceInfo;)V", "getLoadInfo", "()Lcom/tencent/pigeon/mm_foundation/ImageLoadPerformanceInfo;", "getPath", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AvatarInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.mm_foundation.AvatarInfo.Companion INSTANCE = new com.tencent.pigeon.mm_foundation.AvatarInfo.Companion(null);
    private final com.tencent.pigeon.mm_foundation.ImageLoadPerformanceInfo loadInfo;
    private final java.lang.String path;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/AvatarInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/mm_foundation/AvatarInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.mm_foundation.AvatarInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            com.tencent.pigeon.mm_foundation.ImageLoadPerformanceInfo.Companion companion = com.tencent.pigeon.mm_foundation.ImageLoadPerformanceInfo.INSTANCE;
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            return new com.tencent.pigeon.mm_foundation.AvatarInfo((java.lang.String) obj, companion.fromList((java.util.List) obj2));
        }
    }

    public AvatarInfo(java.lang.String path, com.tencent.pigeon.mm_foundation.ImageLoadPerformanceInfo loadInfo) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(loadInfo, "loadInfo");
        this.path = path;
        this.loadInfo = loadInfo;
    }

    public static /* synthetic */ com.tencent.pigeon.mm_foundation.AvatarInfo copy$default(com.tencent.pigeon.mm_foundation.AvatarInfo avatarInfo, java.lang.String str, com.tencent.pigeon.mm_foundation.ImageLoadPerformanceInfo imageLoadPerformanceInfo, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = avatarInfo.path;
        }
        if ((i17 & 2) != 0) {
            imageLoadPerformanceInfo = avatarInfo.loadInfo;
        }
        return avatarInfo.copy(str, imageLoadPerformanceInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPath() {
        return this.path;
    }

    /* renamed from: component2, reason: from getter */
    public final com.tencent.pigeon.mm_foundation.ImageLoadPerformanceInfo getLoadInfo() {
        return this.loadInfo;
    }

    public final com.tencent.pigeon.mm_foundation.AvatarInfo copy(java.lang.String path, com.tencent.pigeon.mm_foundation.ImageLoadPerformanceInfo loadInfo) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(loadInfo, "loadInfo");
        return new com.tencent.pigeon.mm_foundation.AvatarInfo(path, loadInfo);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.mm_foundation.AvatarInfo)) {
            return false;
        }
        com.tencent.pigeon.mm_foundation.AvatarInfo avatarInfo = (com.tencent.pigeon.mm_foundation.AvatarInfo) other;
        return kotlin.jvm.internal.o.b(this.path, avatarInfo.path) && kotlin.jvm.internal.o.b(this.loadInfo, avatarInfo.loadInfo);
    }

    public final com.tencent.pigeon.mm_foundation.ImageLoadPerformanceInfo getLoadInfo() {
        return this.loadInfo;
    }

    public final java.lang.String getPath() {
        return this.path;
    }

    public int hashCode() {
        return (this.path.hashCode() * 31) + this.loadInfo.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.path, this.loadInfo.toList());
    }

    public java.lang.String toString() {
        return "AvatarInfo(path=" + this.path + ", loadInfo=" + this.loadInfo + ')';
    }
}
