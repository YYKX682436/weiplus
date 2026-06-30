package s20;

/* loaded from: classes13.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s20.d f402272d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(s20.d dVar) {
        super(1);
        this.f402272d = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            s20.d dVar = this.f402272d;
            s20.a aVar = dVar.f402275f;
            android.view.View view = dVar.f402274e;
            if (aVar != null) {
                f3.i iVar = new f3.i(view.getContext().getResources(), bitmap);
                int i17 = dVar.f402273d.f25957h;
                if (i17 == 1) {
                    iVar.c(i65.a.b(view.getContext(), r6.f25958i));
                } else if (i17 == 3) {
                    iVar.b(true);
                }
                aVar.f402262d = iVar;
                iVar.setBounds(0, 0, aVar.f402260b, aVar.f402261c);
            }
            view.postInvalidate();
        }
        return jz5.f0.f302826a;
    }
}
