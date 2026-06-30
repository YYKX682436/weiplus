package pr;

/* loaded from: classes10.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static pr.o f357750e;

    /* renamed from: a, reason: collision with root package name */
    public final fp0.o f357751a;

    /* renamed from: b, reason: collision with root package name */
    public int f357752b;

    /* renamed from: c, reason: collision with root package name */
    public int f357753c;

    /* renamed from: d, reason: collision with root package name */
    public final pr.m f357754d;

    public o() {
        fp0.o oVar = new fp0.o(new gp0.g(new gp0.b(Integer.MAX_VALUE, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "EmojiDesigner"));
        this.f357751a = oVar;
        pr.m mVar = new pr.m(this);
        this.f357754d = mVar;
        oVar.g(mVar);
    }

    public final void a() {
        r45.v75 v75Var;
        java.util.ArrayList d17 = gr.t.g().d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = d17.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo = (com.tencent.mm.storage.emotion.EmojiGroupInfo) it.next();
            z85.s y07 = com.tencent.mm.storage.n5.f().d().y0(emojiGroupInfo.field_productID);
            r45.se3 se3Var = new r45.se3();
            if ((y07 != null ? y07.field_content : null) != null) {
                try {
                    se3Var.parseFrom(y07.field_content);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiPackSyncManager", e17, "", new java.lang.Object[0]);
                }
            }
            r45.qj0 qj0Var = se3Var.f385652d;
            if (qj0Var == null || (v75Var = qj0Var.E) == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPackSyncManager", "start: GetEmotionDetail " + emojiGroupInfo.field_productID);
                if (kotlin.jvm.internal.o.b(emojiGroupInfo.field_productID, "17")) {
                    continue;
                } else {
                    java.lang.String str = emojiGroupInfo.field_productID;
                    kotlin.jvm.internal.o.f(str, "getProductID(...)");
                    new gr.e(str).l().K(new pr.n(emojiGroupInfo));
                }
            } else {
                int i17 = v75Var.f387964d;
                if (!arrayList.contains(java.lang.Integer.valueOf(i17))) {
                    arrayList.add(java.lang.Integer.valueOf(i17));
                }
            }
            if (arrayList.size() >= 50) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPackSyncManager", "start: too many groups " + d17.size());
                break;
            }
        }
        this.f357752b = arrayList.size();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            int intValue = ((java.lang.Number) it6.next()).intValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPackSyncManager", "checkStart: add task " + intValue);
            this.f357751a.a(new pr.f(intValue));
        }
    }
}
