package px0;

/* loaded from: classes4.dex */
public final class c implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f358767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment f358768e;

    public c(android.content.Context context, com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment) {
        this.f358767d = context;
        this.f358768e = materialImportPreviewFragment;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            android.content.Context context = this.f358767d;
            g4Var.d(1001, b3.l.getColor(context, com.tencent.mm.R.color.Red_100), context.getResources().getString(com.tencent.mm.R.string.p_o));
            if (this.f358768e.f69655s.length() > 0) {
                g4Var.f(1002, context.getResources().getString(com.tencent.mm.R.string.p_p));
            }
        }
    }
}
