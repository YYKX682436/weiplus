package com.tencent.pigeon.biz_base;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/tencent/pigeon/biz_base/BizRecFollowActionInfo;", "", dm.i4.COL_USERNAME, "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "", "articleUrl", "(Ljava/lang/String;JLjava/lang/String;)V", "getArticleUrl", "()Ljava/lang/String;", "getScene", "()J", "getUsername", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BizRecFollowActionInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.biz_base.BizRecFollowActionInfo.Companion INSTANCE = new com.tencent.pigeon.biz_base.BizRecFollowActionInfo.Companion(null);
    private final java.lang.String articleUrl;
    private final long scene;
    private final java.lang.String username;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz_base/BizRecFollowActionInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/biz_base/BizRecFollowActionInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.biz_base.BizRecFollowActionInfo fromList(java.util.List<? extends java.lang.Object> list) {
            long longValue;
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = (java.lang.String) obj;
            java.lang.Object obj2 = list.get(1);
            if (obj2 instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) obj2).intValue();
            } else {
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) obj2).longValue();
            }
            return new com.tencent.pigeon.biz_base.BizRecFollowActionInfo(str, longValue, (java.lang.String) list.get(2));
        }
    }

    public BizRecFollowActionInfo(java.lang.String username, long j17, java.lang.String str) {
        kotlin.jvm.internal.o.g(username, "username");
        this.username = username;
        this.scene = j17;
        this.articleUrl = str;
    }

    public static /* synthetic */ com.tencent.pigeon.biz_base.BizRecFollowActionInfo copy$default(com.tencent.pigeon.biz_base.BizRecFollowActionInfo bizRecFollowActionInfo, java.lang.String str, long j17, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = bizRecFollowActionInfo.username;
        }
        if ((i17 & 2) != 0) {
            j17 = bizRecFollowActionInfo.scene;
        }
        if ((i17 & 4) != 0) {
            str2 = bizRecFollowActionInfo.articleUrl;
        }
        return bizRecFollowActionInfo.copy(str, j17, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUsername() {
        return this.username;
    }

    /* renamed from: component2, reason: from getter */
    public final long getScene() {
        return this.scene;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getArticleUrl() {
        return this.articleUrl;
    }

    public final com.tencent.pigeon.biz_base.BizRecFollowActionInfo copy(java.lang.String username, long scene, java.lang.String articleUrl) {
        kotlin.jvm.internal.o.g(username, "username");
        return new com.tencent.pigeon.biz_base.BizRecFollowActionInfo(username, scene, articleUrl);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.biz_base.BizRecFollowActionInfo)) {
            return false;
        }
        com.tencent.pigeon.biz_base.BizRecFollowActionInfo bizRecFollowActionInfo = (com.tencent.pigeon.biz_base.BizRecFollowActionInfo) other;
        return kotlin.jvm.internal.o.b(this.username, bizRecFollowActionInfo.username) && this.scene == bizRecFollowActionInfo.scene && kotlin.jvm.internal.o.b(this.articleUrl, bizRecFollowActionInfo.articleUrl);
    }

    public final java.lang.String getArticleUrl() {
        return this.articleUrl;
    }

    public final long getScene() {
        return this.scene;
    }

    public final java.lang.String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int hashCode = ((this.username.hashCode() * 31) + java.lang.Long.hashCode(this.scene)) * 31;
        java.lang.String str = this.articleUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.username, java.lang.Long.valueOf(this.scene), this.articleUrl);
    }

    public java.lang.String toString() {
        return "BizRecFollowActionInfo(username=" + this.username + ", scene=" + this.scene + ", articleUrl=" + this.articleUrl + ')';
    }

    public /* synthetic */ BizRecFollowActionInfo(java.lang.String str, long j17, java.lang.String str2, int i17, kotlin.jvm.internal.i iVar) {
        this(str, j17, (i17 & 4) != 0 ? null : str2);
    }
}
