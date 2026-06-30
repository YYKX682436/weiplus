package ko2;

/* loaded from: classes2.dex */
public final class a implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f309917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f309918e;

    public a(int i17, android.content.Context context, java.lang.String str) {
        this.f309917d = context;
        this.f309918e = str;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            g4Var.d(1, this.f309917d.getResources().getColor(com.tencent.mm.R.color.f478532ac), this.f309918e);
        }
    }
}
