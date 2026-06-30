package ed1;

/* loaded from: classes15.dex */
public final class f extends ed1.k {

    /* renamed from: c, reason: collision with root package name */
    public static dd1.a f251241c;

    /* renamed from: d, reason: collision with root package name */
    public static ed1.f f251242d;

    /* renamed from: b, reason: collision with root package name */
    public android.nfc.cardemulation.HostApduService f251243b;

    static {
        new ed1.a(null);
    }

    public final android.nfc.cardemulation.CardEmulation f(android.content.Context context, dd1.a aVar) {
        if (context == null) {
            aVar.b(b("myContext is null"));
            return null;
        }
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(context);
        if (defaultAdapter == null) {
            aVar.b(b("getDefaultAdapter is null"));
            return null;
        }
        android.nfc.cardemulation.CardEmulation cardEmulation = android.nfc.cardemulation.CardEmulation.getInstance(defaultAdapter);
        if (cardEmulation != null) {
            return cardEmulation;
        }
        aVar.b(b("cardEmulation is null"));
        return null;
    }

    public final void g(android.content.Context context, java.util.Set set, dd1.a aVar) {
        android.nfc.cardemulation.CardEmulation f17 = f(context, aVar);
        if (f17 == null) {
            return;
        }
        kotlin.jvm.internal.o.d(context);
        if (!f17.registerAidsForService(new android.content.ComponentName(context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.HCEService.class), "payment", kz5.n0.S0(set))) {
            aVar.b(b("registerAidsForService failed"));
            return;
        }
        aVar.b(d("registerAids success aids=" + set));
    }
}
