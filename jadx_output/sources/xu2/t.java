package xu2;

/* loaded from: classes3.dex */
public final class t extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xu2.u f457229a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(xu2.u uVar, long j17) {
        super(j17, 100L);
        this.f457229a = uVar;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        xu2.u uVar = this.f457229a;
        ((mm2.c1) uVar.S0().a(mm2.c1.class)).O5 = uVar.V0().f309129d.Z;
        android.widget.TextView textView = uVar.f457237w;
        if (textView == null) {
            return;
        }
        textView.setVisibility(4);
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        xu2.u uVar = this.f457229a;
        ((mm2.c1) uVar.S0().a(mm2.c1.class)).O5 = (int) ((uVar.V0().f309129d.Z - (j17 / 1000)) - 1);
        if (!uVar.V0().f309129d.Y || uVar.u1() <= 0) {
            android.widget.TextView textView = uVar.f457237w;
            if (textView == null) {
                return;
            }
            textView.setVisibility(4);
            return;
        }
        android.widget.TextView textView2 = uVar.f457237w;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(0);
    }
}
