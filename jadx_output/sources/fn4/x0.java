package fn4;

/* loaded from: classes.dex */
public class x0 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f264618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean[] f264619b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.xn6 f264620c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f264621d;

    public x0(com.tencent.mm.ui.widget.dialog.u3 u3Var, boolean[] zArr, r45.xn6 xn6Var, android.content.Context context) {
        this.f264618a = u3Var;
        this.f264619b = zArr;
        this.f264620c = xn6Var;
        this.f264621d = context;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        this.f264618a.dismiss();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        boolean[] zArr = this.f264619b;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "jumpToProfile getNow:%s, isCancel:%s", valueOf, java.lang.Boolean.valueOf(zArr[0]));
        if (!zArr[0] && z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", this.f264620c.Z);
            intent.putExtra("biz_profile_tab_type", 1);
            j45.l.j(this.f264621d, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        }
    }
}
