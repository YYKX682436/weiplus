package nr3;

/* loaded from: classes10.dex */
public final class e implements vg3.s4 {
    @Override // vg3.o3
    public void f(com.tencent.mm.storage.z3 z3Var) {
    }

    @Override // vg3.o3
    public void i(java.lang.String str, java.lang.String str2) {
        if (str == null && str2 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ProcessImageDescriptionExtension", "both username and encryptUsername is null");
            return;
        }
        com.tencent.mm.plugin.profile.n2 n2Var = com.tencent.mm.plugin.profile.n2.f153540a;
        java.util.ArrayList arrayList = new java.util.ArrayList(n2Var.e(str));
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = new java.util.ArrayList(n2Var.e(str2));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ProcessImageDescriptionExtension", "assemble() user: %s, encryptUser: %s, remarkImagePathList: %s", str, str2, com.tencent.mm.contact.b.b(arrayList));
        com.tencent.mm.autogen.events.GetNewContactEvent getNewContactEvent = new com.tencent.mm.autogen.events.GetNewContactEvent();
        am.gg ggVar = getNewContactEvent.f54405g;
        ggVar.f6760a = str;
        ggVar.f6761b = com.tencent.mm.contact.b.b(arrayList);
        getNewContactEvent.e();
    }

    @Override // vg3.o3
    public void q(com.tencent.mm.storage.z3 z3Var) {
    }

    @Override // vg3.o3
    public void t(com.tencent.mm.storage.z3 z3Var) {
    }
}
