package dk2;

/* loaded from: classes3.dex */
public final class o3 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ke2.f f233832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233833b;

    public o3(ke2.f fVar, android.content.Context context) {
        this.f233832a = fVar;
        this.f233833b = context;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        android.content.Context context = this.f233833b;
        if (i18 == -200139) {
            android.content.Context context2 = this.f233833b;
            db5.e1.E(context2, context2.getString(com.tencent.mm.R.string.cz9), "", context.getString(com.tencent.mm.R.string.f490454vi), false, null);
        } else {
            db5.t7.g(context, context.getString(com.tencent.mm.R.string.f491543dh2));
        }
        ke2.f fVar = this.f233832a;
        if (fVar != null) {
            fVar.a(i17, i18, str, j17, cv2Var);
        }
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        ke2.f fVar = this.f233832a;
        if (fVar != null) {
            fVar.b(j17, j18, cv2Var);
        }
    }
}
