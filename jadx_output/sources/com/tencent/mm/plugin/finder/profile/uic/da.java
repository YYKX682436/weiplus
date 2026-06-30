package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class da implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123622a;

    public da(com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f123622a = obVar;
    }

    @Override // fp0.p
    public void a(fp0.d task, fp0.u status) {
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        fp0.u uVar = fp0.u.f265291g;
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123622a;
        if (status == uVar) {
            db5.t7.makeText(obVar.getActivity(), obVar.getString(com.tencent.mm.R.string.f9b), 0).show();
        } else {
            db5.t7.makeText(obVar.getActivity(), obVar.getString(com.tencent.mm.R.string.f9d), 0).show();
        }
    }
}
