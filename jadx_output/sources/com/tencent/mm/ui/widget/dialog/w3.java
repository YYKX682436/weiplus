package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes5.dex */
public class w3 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ db5.d5 f212013a;

    public w3(db5.d5 d5Var) {
        this.f212013a = d5Var;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        this.f212013a.dismiss();
        super.handleMessage(message);
    }
}
