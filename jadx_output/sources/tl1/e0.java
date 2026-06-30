package tl1;

/* loaded from: classes15.dex */
public class e0 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker f420203a;

    public e0(com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker yANumberPicker) {
        this.f420203a = yANumberPicker;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        super.handleMessage(message);
        int i17 = message.what;
        com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker yANumberPicker = this.f420203a;
        if (i17 == 2) {
            com.tencent.mm.plugin.appbrand.widget.picker.YANumberPicker.a(yANumberPicker, message.arg1, message.arg2, message.obj);
        } else {
            if (i17 != 3) {
                return;
            }
            yANumberPicker.requestLayout();
        }
    }
}
