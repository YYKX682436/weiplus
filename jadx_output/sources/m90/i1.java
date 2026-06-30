package m90;

/* loaded from: classes4.dex */
public class i1 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f324875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f324876f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f324877g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f324878h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f324879i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(m90.j1 j1Var, int i17, r35.m3 m3Var, android.os.Bundle bundle, java.util.Map map, java.lang.String str, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        super(i17, m3Var);
        this.f324875e = bundle;
        this.f324876f = map;
        this.f324877g = str;
        this.f324878h = weakReference;
        this.f324879i = weakReference2;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        java.lang.String str = "";
        try {
            java.lang.String string = this.f324875e.getString("send_msg_username", "");
            java.lang.String str2 = (java.lang.String) this.f324876f.get(this.f324877g + ".chatname");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 != null) {
                str = str2;
            }
            com.tencent.mm.autogen.mmdata.rpt.OpenIMSucceedContactLogStruct openIMSucceedContactLogStruct = new com.tencent.mm.autogen.mmdata.rpt.OpenIMSucceedContactLogStruct();
            openIMSucceedContactLogStruct.q(string);
            openIMSucceedContactLogStruct.f59797f = 2L;
            openIMSucceedContactLogStruct.f59798g = 2L;
            openIMSucceedContactLogStruct.f59801j = 1L;
            openIMSucceedContactLogStruct.k();
            ((sg3.r) i95.n0.c(sg3.r.class)).mj(str);
            ((ih3.e) ((tg3.k1) i95.n0.c(tg3.k1.class))).Di("link_jump_chat", this.f324876f, this.f324875e, this.f324878h, this.f324879i);
        } catch (java.lang.Throwable unused) {
        }
    }
}
