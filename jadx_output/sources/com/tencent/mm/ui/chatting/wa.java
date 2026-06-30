package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class wa implements com.tencent.mm.ui.wc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.db f206217a;

    public wa(com.tencent.mm.ui.chatting.db dbVar) {
        this.f206217a = dbVar;
    }

    @Override // com.tencent.mm.ui.wc
    public void a(android.view.MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.f206217a.n7(motionEvent);
        }
    }

    @Override // com.tencent.mm.ui.wc
    public java.lang.String key() {
        return java.lang.String.valueOf(this.f206217a.hashCode());
    }
}
