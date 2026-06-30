package com.tencent.pigeon.mm_foundation;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/FlutterUserInfo;", "", "userName", "", "nickName", "(Ljava/lang/String;Ljava/lang/String;)V", "getNickName", "()Ljava/lang/String;", "getUserName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FlutterUserInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.mm_foundation.FlutterUserInfo.Companion INSTANCE = new com.tencent.pigeon.mm_foundation.FlutterUserInfo.Companion(null);
    private final java.lang.String nickName;
    private final java.lang.String userName;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/mm_foundation/FlutterUserInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/mm_foundation/FlutterUserInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.mm_foundation.FlutterUserInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            return new com.tencent.pigeon.mm_foundation.FlutterUserInfo((java.lang.String) obj, (java.lang.String) obj2);
        }
    }

    public FlutterUserInfo(java.lang.String userName, java.lang.String nickName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(nickName, "nickName");
        this.userName = userName;
        this.nickName = nickName;
    }

    public static /* synthetic */ com.tencent.pigeon.mm_foundation.FlutterUserInfo copy$default(com.tencent.pigeon.mm_foundation.FlutterUserInfo flutterUserInfo, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = flutterUserInfo.userName;
        }
        if ((i17 & 2) != 0) {
            str2 = flutterUserInfo.nickName;
        }
        return flutterUserInfo.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUserName() {
        return this.userName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getNickName() {
        return this.nickName;
    }

    public final com.tencent.pigeon.mm_foundation.FlutterUserInfo copy(java.lang.String userName, java.lang.String nickName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(nickName, "nickName");
        return new com.tencent.pigeon.mm_foundation.FlutterUserInfo(userName, nickName);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.mm_foundation.FlutterUserInfo)) {
            return false;
        }
        com.tencent.pigeon.mm_foundation.FlutterUserInfo flutterUserInfo = (com.tencent.pigeon.mm_foundation.FlutterUserInfo) other;
        return kotlin.jvm.internal.o.b(this.userName, flutterUserInfo.userName) && kotlin.jvm.internal.o.b(this.nickName, flutterUserInfo.nickName);
    }

    public final java.lang.String getNickName() {
        return this.nickName;
    }

    public final java.lang.String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return (this.userName.hashCode() * 31) + this.nickName.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(this.userName, this.nickName);
    }

    public java.lang.String toString() {
        return "FlutterUserInfo(userName=" + this.userName + ", nickName=" + this.nickName + ')';
    }
}
