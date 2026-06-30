package id2;

/* loaded from: classes.dex */
public final class o4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f290718d;

    public o4(android.app.Activity activity) {
        this.f290718d = activity;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            g4Var.d(1, android.graphics.Color.parseColor("#FA5151"), this.f290718d.getResources().getString(com.tencent.mm.R.string.mag));
        }
    }
}
