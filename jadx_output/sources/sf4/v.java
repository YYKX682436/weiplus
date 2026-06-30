package sf4;

/* loaded from: classes3.dex */
public final /* synthetic */ class v implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f407599a;

    public v(yz5.p function) {
        kotlin.jvm.internal.o.g(function, "function");
        this.f407599a = function;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final /* synthetic */ void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        this.f407599a.invoke(compoundButton, java.lang.Boolean.valueOf(z17));
    }
}
