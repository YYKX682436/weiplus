package tl1;

/* loaded from: classes15.dex */
public class d0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker f420201a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker yANumberPicker, java.lang.String str) {
        super(str);
        this.f420201a = yANumberPicker;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int j17;
        int i17 = message.what;
        com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker yANumberPicker = this.f420201a;
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker.a(yANumberPicker, message.arg1, message.arg2, message.obj);
            return;
        }
        int i18 = 0;
        if (!yANumberPicker.f91844y0.c()) {
            if (yANumberPicker.F1 == 0) {
                yANumberPicker.n(1);
            }
            yANumberPicker.C1.sendMessageDelayed(yANumberPicker.g(1, 0, 0, message.obj), 32L);
            return;
        }
        if (yANumberPicker.T1 != 0) {
            if (yANumberPicker.F1 == 0) {
                yANumberPicker.n(1);
            }
            int i19 = yANumberPicker.T1;
            int i27 = yANumberPicker.O1;
            if (i19 < (-i27) / 2) {
                int i28 = (int) (((i27 + i19) * 300.0f) / i27);
                yANumberPicker.f91844y0.d(0, yANumberPicker.U1, 0, i27 + i19, i28 * 3);
                j17 = yANumberPicker.j(yANumberPicker.U1 + yANumberPicker.O1 + yANumberPicker.T1);
                i18 = i28;
            } else {
                int i29 = (int) (((-i19) * 300.0f) / i27);
                yANumberPicker.f91844y0.d(0, yANumberPicker.U1, 0, i19, i29 * 3);
                i18 = i29;
                j17 = yANumberPicker.j(yANumberPicker.U1 + yANumberPicker.T1);
            }
            yANumberPicker.postInvalidate();
        } else {
            yANumberPicker.n(0);
            j17 = yANumberPicker.j(yANumberPicker.U1);
        }
        android.os.Message g17 = yANumberPicker.g(2, yANumberPicker.F, j17, message.obj);
        if (yANumberPicker.f91841x0) {
            yANumberPicker.D1.sendMessageDelayed(g17, i18 * 2);
        } else {
            yANumberPicker.C1.sendMessageDelayed(g17, i18 * 2);
        }
    }
}
