package z83;

/* loaded from: classes5.dex */
public final class z implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x83.h f470760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegRebindUI f470761e;

    public z(x83.h hVar, com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegRebindUI kidsWatchRegRebindUI) {
        this.f470760d = hVar;
        this.f470761e = kidsWatchRegRebindUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f470760d);
        gm0.j1.d().q(5888, this.f470761e);
    }
}
