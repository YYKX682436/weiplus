package hr3;

/* loaded from: classes11.dex */
public class ig implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.a f283660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI f283661e;

    public ig(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI, r35.a aVar) {
        this.f283661e = sayHiWithSnsPermissionUI;
        this.f283660d = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f283660d.getClass();
        ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436679e, vg3.b.f436646f, vg3.c.f436654f, -88888888, new java.util.ArrayList(java.util.Collections.singletonList(this.f283661e.f153826q))));
    }
}
