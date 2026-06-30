package wx0;

/* loaded from: classes5.dex */
public final class r0 implements android.widget.RadioGroup.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wx0.s0 f450535a;

    public r0(wx0.s0 s0Var) {
        this.f450535a = s0Var;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.RadioGroup radioGroup, int i17) {
        kotlin.jvm.internal.o.g(radioGroup, "radioGroup");
        radioGroup.performHapticFeedback(6);
        this.f450535a.c(i17 == com.tencent.mm.R.id.rpa ? wx0.m0.f450512d : i17 == com.tencent.mm.R.id.f486780s46 ? wx0.m0.f450513e : i17 == com.tencent.mm.R.id.s8e ? wx0.m0.f450514f : wx0.m0.f450512d);
    }
}
