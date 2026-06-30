package dk2;

/* loaded from: classes3.dex */
public final class vb implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.ac f234245a;

    public vb(dk2.ac acVar) {
        this.f234245a = acVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean b17 = fVar.b();
        dk2.ac acVar = this.f234245a;
        if (b17) {
            r45.ab2 ab2Var = (r45.ab2) ke2.o0.f306976v.a(fVar, new r45.ab2());
            java.lang.String string = ab2Var != null ? ab2Var.getString(0) : null;
            java.lang.String str = acVar.f233203g;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type ");
            r45.bd5 bd5Var = acVar.f233197a;
            sb6.append(bd5Var != null ? java.lang.Integer.valueOf(bd5Var.getInteger(13)) : null);
            sb6.append(" productID ");
            sb6.append(acVar.f233198b);
            sb6.append(" success wording ");
            sb6.append(string);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            if (!(string == null || string.length() == 0)) {
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(acVar.f233199c);
                e4Var.f211776c = string;
                e4Var.c();
            }
            acVar.f233202f.invoke();
        } else {
            java.lang.String str2 = acVar.f233203g;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("type ");
            r45.bd5 bd5Var2 = acVar.f233197a;
            sb7.append(bd5Var2 != null ? java.lang.Integer.valueOf(bd5Var2.getInteger(13)) : null);
            sb7.append(" productID ");
            sb7.append(acVar.f233198b);
            sb7.append(" fail errType ");
            sb7.append(fVar.f70615a);
            sb7.append(" errCode ");
            sb7.append(fVar.f70616b);
            sb7.append(" errMsg ");
            sb7.append(fVar.f70617c);
            com.tencent.mars.xlog.Log.i(str2, sb7.toString());
        }
        return jz5.f0.f302826a;
    }
}
