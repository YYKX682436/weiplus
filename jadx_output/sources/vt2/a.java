package vt2;

/* loaded from: classes3.dex */
public final class a implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vt2.c f439935a;

    public a(vt2.c cVar) {
        this.f439935a = cVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean b17 = fVar.b();
        vt2.c cVar = this.f439935a;
        if (b17) {
            bw5.wk wkVar = (bw5.wk) ke2.o0.f306976v.a(fVar, new bw5.wk());
            boolean z17 = true;
            java.lang.String str = wkVar != null ? wkVar.f34755e[1] ? wkVar.f34754d : "" : null;
            com.tencent.mars.xlog.Log.i(cVar.f439945f, "type " + cVar.f439940a + " productID " + cVar.f439941b + " success wording " + str);
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(cVar.f439942c);
                e4Var.f211776c = str;
                e4Var.c();
            }
            cVar.f439944e.invoke();
        } else {
            com.tencent.mars.xlog.Log.e(cVar.f439945f, "type " + cVar.f439940a + " productID " + cVar.f439941b + " fail errType " + fVar.f70615a + " errCode " + fVar.f70616b + " errMsg " + fVar.f70617c);
        }
        return jz5.f0.f302826a;
    }
}
