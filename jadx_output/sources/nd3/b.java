package nd3;

/* loaded from: classes.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "showMessagePopupMenu";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("frameSetId");
        int optInt = data.optInt("positionX");
        int optInt2 = data.optInt("positionY");
        kotlin.jvm.internal.o.d(optString);
        if (optString.length() == 0) {
            s().invoke(h(1, "empty frameSetId"));
            return;
        }
        lc3.e eVar = this.f317890a;
        kotlin.jvm.internal.o.e(eVar, "null cannot be cast to non-null type com.tencent.mm.magicbrush.plugin.scl.biz.IMagicCardStarterSclBizClass");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("framesetid", optString);
        hashMap.put("posx", java.lang.Integer.valueOf(optInt));
        hashMap.put("posy", java.lang.Integer.valueOf(optInt2));
        ((hq0.b0) ((hq0.i) eVar)).O1("showMessagePopupMenu", hashMap, new nd3.a(this));
        s().invoke(k());
    }
}
