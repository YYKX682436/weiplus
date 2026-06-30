package q23;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final q23.e f359812a = new q23.e();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f359813b;

    static {
        f359813b = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_LIVE_PHOTO_SELECT_SHOW_INT, 0) == 1;
    }

    public final boolean a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryLivePhotoTeaDialogHelper", "checkShowTeachDialog >> " + f359813b);
        if (f359813b) {
            return false;
        }
        f359813b = true;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LIVE_PHOTO_SELECT_SHOW_INT, 1);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 2, 0);
        z2Var.F = new q23.c(z2Var);
        z2Var.x(1);
        z2Var.y(i65.a.r(context, com.tencent.mm.R.string.f490454vi));
        z2Var.i(com.tencent.mm.R.layout.eiv);
        z2Var.C();
        return true;
    }
}
