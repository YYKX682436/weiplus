package k50;

/* loaded from: classes9.dex */
public final class j extends m50.x {

    /* renamed from: s, reason: collision with root package name */
    public final v05.b f304229s;

    /* renamed from: t, reason: collision with root package name */
    public long f304230t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f304229s = new v05.b();
    }

    @Override // m50.x
    public co.a V6() {
        return new ec5.a();
    }

    @Override // m50.x
    public java.lang.String W6() {
        java.lang.String xml;
        l15.c j17 = ((ec5.a) c7()).j();
        return (j17 == null || (xml = j17.toXml()) == null) ? "" : xml;
    }

    @Override // m50.x
    public int b7() {
        return 49;
    }

    @Override // m50.x
    public boolean k7(xi5.e action) {
        boolean z17;
        kotlin.jvm.internal.o.g(action, "action");
        if (this.f304230t > 0) {
            rd0.k1 k1Var = (rd0.k1) i95.n0.c(rd0.k1.class);
            androidx.appcompat.app.AppCompatActivity context = getActivity();
            com.tencent.mm.sendtowework.FileData fileData = new com.tencent.mm.sendtowework.FileData(((ec5.a) c7()).getFilePath(), java.lang.Long.valueOf(this.f304230t), ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).wi(this.f304229s));
            ((com.tencent.mm.ui.chatting.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).getClass();
            com.tencent.wework.api.IWWAPI.WWAppType d17 = com.tencent.mm.ui.chatting.hd.d(action.f454741b);
            ((com.tencent.mm.ui.chatting.fd) k1Var).getClass();
            kotlin.jvm.internal.o.g(context, "context");
            try {
                com.tencent.mm.ui.chatting.hd.m(context, fileData, d17);
                z17 = true;
            } catch (com.tencent.mm.ui.chatting.nd unused) {
                z17 = false;
            }
            if (z17) {
                return true;
            }
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getActivity());
            u1Var.g(getActivity().getString(com.tencent.mm.R.string.ncc));
            u1Var.a(true);
            u1Var.l(null);
            u1Var.q(false);
        } else {
            com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(getActivity());
            u1Var2.g(getActivity().getString(com.tencent.mm.R.string.ncd));
            u1Var2.a(true);
            u1Var2.l(null);
            u1Var2.q(false);
        }
        return false;
    }

    @Override // m50.x
    public void o7(java.lang.String toUser) {
        c01.h7 h7Var;
        kotlin.jvm.internal.o.g(toUser, "toUser");
        com.tencent.mm.storage.f9 e76 = e7();
        if (e76 != null) {
            h7Var = new c01.h7();
            h7Var.f37227b = e76.getMsgId();
            h7Var.f37229d = e76.Q0();
        } else {
            h7Var = null;
        }
        ut.s0 s0Var = new ut.s0(toUser, ((ec5.a) c7()).getFilePath());
        s0Var.f430723g = h7Var;
        java.lang.String wi6 = ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).wi(this.f304229s);
        if (wi6 == null) {
            wi6 = "";
        }
        s0Var.f430719c = wi6;
        if (h7Var != null) {
            s0Var.f430721e = "forward_file_msg";
        } else {
            s0Var.f430721e = "forward_file_path";
        }
        kotlinx.coroutines.flow.j tj6 = ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).tj(((ot.i) ((pt.h0) i95.n0.c(pt.h0.class))).Zi(s0Var));
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new k50.i(tj6, null), 1, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        if (kotlin.jvm.internal.o.b(r5, r7 != null ? r7.getString(r7.f368364d + 1) : null) == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreateAfter(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.j.onCreateAfter(android.os.Bundle):void");
    }

    @Override // m50.x
    public java.lang.String p7() {
        java.lang.String filePath = ((ec5.a) c7()).getFilePath();
        if ((filePath == null || r26.n0.N(filePath)) || !com.tencent.mm.vfs.w6.j(filePath)) {
            return null;
        }
        return filePath;
    }
}
