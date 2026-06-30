package com.tencent.mm.ui.chatting.component;

/* loaded from: classes.dex */
public final class ne extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.oe f199587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f199588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f199589f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne(com.tencent.mm.ui.chatting.component.oe oeVar, long j17, int i17) {
        super(0);
        this.f199587d = oeVar;
        this.f199588e = j17;
        this.f199589f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Long j17;
        com.tencent.mm.storage.a3 z07;
        java.util.List A0;
        com.tencent.mm.ui.chatting.component.oe oeVar = this.f199587d;
        java.lang.String x17 = oeVar.f198580d.x();
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        int size = (a17 == null || (z07 = a17.z0(x17)) == null || (A0 = z07.A0()) == null) ? 0 : A0.size();
        com.tencent.mm.autogen.mmdata.rpt.NewGroupRecommendStruct newGroupRecommendStruct = new com.tencent.mm.autogen.mmdata.rpt.NewGroupRecommendStruct();
        newGroupRecommendStruct.f59681e = this.f199588e;
        java.lang.String stringExtra = oeVar.f198580d.g().getIntent().getStringExtra("from_create_group_session_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        newGroupRecommendStruct.f59683g = newGroupRecommendStruct.b("create_group_sessionid", stringExtra, true);
        newGroupRecommendStruct.f59684h = newGroupRecommendStruct.b("chat_username", oeVar.f198580d.x(), true);
        newGroupRecommendStruct.f59685i = size;
        java.lang.String stringExtra2 = oeVar.f198580d.g().getIntent().getStringExtra("from_create_group_select_num");
        newGroupRecommendStruct.f59682f = (stringExtra2 == null || (j17 = r26.h0.j(stringExtra2)) == null) ? 0L : j17.longValue();
        newGroupRecommendStruct.f59680d = this.f199589f;
        newGroupRecommendStruct.f59686j = 20250909L;
        newGroupRecommendStruct.k();
        return jz5.f0.f302826a;
    }
}
