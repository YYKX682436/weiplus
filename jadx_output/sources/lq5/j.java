package lq5;

/* loaded from: classes8.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wepicker.WePicker f320485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f320486e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.wepicker.WePicker wePicker, java.util.List list) {
        super(1);
        this.f320485d = wePicker;
        this.f320486e = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.wepicker.WePicker wePicker = this.f320485d;
        wePicker.post(new lq5.i(intValue, wePicker, this.f320486e));
        return jz5.f0.f302826a;
    }
}
