package rl3;

/* loaded from: classes15.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f397262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rl3.o f397263e;

    public m(rl3.o oVar, int i17) {
        this.f397263e = oVar;
        this.f397262d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f492609h53), 0).show();
        rl3.p pVar = this.f397263e.f397264a;
        rl3.p.w(pVar, pVar.f397265k, this.f397262d);
    }
}
