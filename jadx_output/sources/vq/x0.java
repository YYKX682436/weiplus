package vq;

/* loaded from: classes12.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439233d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f439233d = emojiDebugUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList;
        com.tencent.mm.smiley.e1 b17 = com.tencent.mm.smiley.e1.b();
        synchronized (b17.f193243c) {
            arrayList = new java.util.ArrayList(b17.f193243c);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.emotion.SmileyPanelConfigInfo smileyPanelConfigInfo = (com.tencent.mm.storage.emotion.SmileyPanelConfigInfo) it.next();
            com.tencent.mm.smiley.t1 a17 = com.tencent.mm.smiley.t1.f193375m.a();
            java.lang.String field_key = smileyPanelConfigInfo.field_key;
            kotlin.jvm.internal.o.f(field_key, "field_key");
            com.tencent.mm.storage.emotion.SmileyInfo f17 = a17.f(field_key);
            java.lang.String d17 = com.tencent.mm.smiley.g.b().d(smileyPanelConfigInfo.field_key);
            if (f17 == null) {
                int i17 = smileyPanelConfigInfo.field_key.codePoints().toArray()[0];
                r26.a.a(16);
                java.lang.String num = java.lang.Integer.toString(i17, 16);
                kotlin.jvm.internal.o.f(num, "toString(...)");
                java.lang.String concat = "\\\\u".concat(num);
                java.lang.String field_key2 = smileyPanelConfigInfo.field_key;
                kotlin.jvm.internal.o.f(field_key2, "field_key");
                java.nio.charset.Charset charset = r26.c.f368865a;
                byte[] bytes = field_key2.getBytes(charset);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                byte[] encode = android.util.Base64.encode(bytes, 0);
                kotlin.jvm.internal.o.f(encode, "encode(...)");
                new java.lang.String(encode, charset);
                com.tencent.mars.xlog.Log.i(this.f439233d.d, "smiley key : " + smileyPanelConfigInfo.field_key + ", " + concat + ", " + d17);
            }
        }
        return jz5.f0.f302826a;
    }
}
