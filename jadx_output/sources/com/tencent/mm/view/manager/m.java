package com.tencent.mm.view.manager;

/* loaded from: classes15.dex */
public class m implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.manager.d f213667d;

    public m(com.tencent.mm.view.manager.d dVar) {
        this.f213667d = dVar;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (android.text.TextUtils.isEmpty(str) || !str.equals("event_update_group")) {
            return;
        }
        this.f213667d.f213643s.b();
    }
}
