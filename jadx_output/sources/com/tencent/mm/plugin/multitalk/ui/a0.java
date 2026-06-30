package com.tencent.mm.plugin.multitalk.ui;

/* loaded from: classes14.dex */
public final class a0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.b0 f150252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f150253e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f150254f;

    public a0(com.tencent.mm.plugin.multitalk.ui.b0 b0Var, java.util.List list, java.lang.String str) {
        this.f150252d = b0Var;
        this.f150253e = list;
        this.f150254f = str;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.modeltalkroom.MultiTalkGroupMember multiTalkGroupMember = (com.tencent.mm.modeltalkroom.MultiTalkGroupMember) obj;
        com.tencent.mm.modeltalkroom.MultiTalkGroupMember multiTalkGroupMember2 = (com.tencent.mm.modeltalkroom.MultiTalkGroupMember) obj2;
        java.lang.String str = multiTalkGroupMember.f71612d;
        java.lang.String usrName = multiTalkGroupMember2.f71612d;
        kotlin.jvm.internal.o.f(usrName, "usrName");
        int compareTo = str.compareTo(usrName);
        java.lang.String userName = this.f150254f;
        kotlin.jvm.internal.o.f(userName, "$userName");
        com.tencent.mm.plugin.multitalk.ui.b0 b0Var = this.f150252d;
        java.util.List list = this.f150253e;
        return (com.tencent.mm.plugin.multitalk.ui.b0.N6(b0Var, multiTalkGroupMember, list, userName) + (compareTo > 0 ? 1 : compareTo == 0 ? -1 : 0)) - com.tencent.mm.plugin.multitalk.ui.b0.N6(b0Var, multiTalkGroupMember2, list, userName);
    }
}
