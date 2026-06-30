package up3;

/* loaded from: classes12.dex */
public final class b0 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f429811a = tp3.b.a("¯¬¼ ¥¥\u009b·£¶µ¤±·");

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f429812b = tp3.b.a("¤´ \u009f¢¯§");

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f429813c = tp3.b.a("¯ ª\u0090½¹¦¤¥¡\u0099´\u00ad ²°");

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f429814d = tp3.b.a("\u00ad¿©\u0090¸»¥¨¡¶µ\u0098¬¨±·");

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f429815e = tp3.b.a("®£«\u0097¼º§«¤¢\u0098¦¨®¦");

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f429816f = tp3.b.a("©»\u00ad\u0094¶±¾\u0098® ¯¦");

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f429817g = tp3.b.a("¥·¡\u0098° ¶«");

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f429818h = tp3.b.a("·¥·\u008e¶¶ \u0092¯©¼¬¸\u0094§ª«·¬¤¶¦");

    public b0(up3.r rVar) {
    }

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17) {
        android.content.Intent intent = new android.content.Intent(f429811a);
        intent.putExtra(f429812b, f429815e);
        intent.putExtra(f429816f, str);
        intent.putExtra(f429817g, str2);
        intent.putExtra(f429818h, z17);
        intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        context.sendBroadcast(intent, com.tencent.mm.sdk.platformtools.v9.a());
    }

    public static void b(android.content.Context context, java.lang.String str, java.lang.String[] strArr) {
        android.content.Intent intent = new android.content.Intent(f429811a);
        intent.putExtra(f429812b, f429813c);
        intent.putExtra(f429816f, str);
        intent.putExtra(f429814d, strArr);
        intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        context.sendBroadcast(intent, com.tencent.mm.sdk.platformtools.v9.a());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (!f429811a.equals(intent.getAction())) {
            com.tencent.mars.xlog.Log.e(up3.d0.f429823d, "Explained by site 1.");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra(f429812b);
        ((ku5.t0) ku5.t0.f312615d).g(new up3.a0(this, stringExtra, intent));
    }
}
