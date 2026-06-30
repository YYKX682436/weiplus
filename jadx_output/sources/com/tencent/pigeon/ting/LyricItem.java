package com.tencent.pigeon.ting;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/tencent/pigeon/ting/LyricItem;", "", "lyric", "", "startTime", "", "(Ljava/lang/String;D)V", "getLyric", "()Ljava/lang/String;", "getStartTime", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LyricItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.ting.LyricItem.Companion INSTANCE = new com.tencent.pigeon.ting.LyricItem.Companion(null);
    private final java.lang.String lyric;
    private final double startTime;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/ting/LyricItem$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/ting/LyricItem;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.ting.LyricItem fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Double");
            return new com.tencent.pigeon.ting.LyricItem((java.lang.String) obj, ((java.lang.Double) obj2).doubleValue());
        }
    }

    public LyricItem(java.lang.String lyric, double d17) {
        kotlin.jvm.internal.o.g(lyric, "lyric");
        this.lyric = lyric;
        this.startTime = d17;
    }

    public static /* synthetic */ com.tencent.pigeon.ting.LyricItem copy$default(com.tencent.pigeon.ting.LyricItem lyricItem, java.lang.String str, double d17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = lyricItem.lyric;
        }
        if ((i17 & 2) != 0) {
            d17 = lyricItem.startTime;
        }
        return lyricItem.copy(str, d17);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLyric() {
        return this.lyric;
    }

    /* renamed from: component2, reason: from getter */
    public final double getStartTime() {
        return this.startTime;
    }

    public final com.tencent.pigeon.ting.LyricItem copy(java.lang.String lyric, double startTime) {
        kotlin.jvm.internal.o.g(lyric, "lyric");
        return new com.tencent.pigeon.ting.LyricItem(lyric, startTime);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.ting.LyricItem)) {
            return false;
        }
        com.tencent.pigeon.ting.LyricItem lyricItem = (com.tencent.pigeon.ting.LyricItem) other;
        return kotlin.jvm.internal.o.b(this.lyric, lyricItem.lyric) && java.lang.Double.compare(this.startTime, lyricItem.startTime) == 0;
    }

    public final java.lang.String getLyric() {
        return this.lyric;
    }

    public final double getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (this.lyric.hashCode() * 31) + java.lang.Double.hashCode(this.startTime);
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.lyric, java.lang.Double.valueOf(this.startTime));
    }

    public java.lang.String toString() {
        return "LyricItem(lyric=" + this.lyric + ", startTime=" + this.startTime + ')';
    }
}
