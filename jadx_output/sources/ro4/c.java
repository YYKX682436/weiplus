package ro4;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f398123a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f398124b = new java.util.LinkedList();

    public c() {
        try {
            java.io.InputStream open = com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open("pag/magic/pag_magic.json");
            kotlin.jvm.internal.o.f(open, "open(...)");
            java.lang.String N1 = com.tencent.mm.sdk.platformtools.t8.N1(open);
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicListData", "initVideoTemplates config:" + N1);
            cl0.e f17 = new cl0.g(N1).f("magicList");
            int length = f17.length();
            for (int i17 = 0; i17 < length; i17++) {
                cl0.g jSONObject = f17.getJSONObject(i17);
                if (jSONObject.optInt("use", 0) == 1) {
                    this.f398124b.add(new ro4.a("pag/magic/" + jSONObject.optString("pag"), "pag/magic/" + jSONObject.optString("cover")));
                }
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicListData", "parse magic config error");
        }
    }

    public final java.util.List a() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = this.f398123a;
        if (linkedList2.size() > 0) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.gpf);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            linkedList.add(new ro4.f(string));
            linkedList.addAll(linkedList2);
        }
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.gpg);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        linkedList.add(new ro4.f(string2));
        java.util.Iterator it = this.f398124b.iterator();
        while (it.hasNext()) {
            linkedList.add(new ro4.d((ro4.a) it.next()));
        }
        return linkedList;
    }
}
