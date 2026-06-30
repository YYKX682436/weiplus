package yw3;

/* loaded from: classes3.dex */
public final class s5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f466879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wepicker.WePicker f466880e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(android.widget.TextView textView, com.tencent.mm.wepicker.WePicker wePicker) {
        super(1);
        this.f466879d = textView;
        this.f466880e = wePicker;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        this.f466879d.setText(this.f466880e.getCurrentValue());
        return jz5.f0.f302826a;
    }
}
