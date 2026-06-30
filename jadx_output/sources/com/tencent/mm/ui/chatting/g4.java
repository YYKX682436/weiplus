package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class g4 {

    /* renamed from: a, reason: collision with root package name */
    public final yb5.d f200522a;

    public g4(yb5.d dVar, long[] jArr) {
        this.f200522a = dVar;
        dVar.f460717l.removeAllOptionMenu();
        dVar.f460717l.addTextOptionMenu(2, dVar.s().getString(com.tencent.mm.R.string.f490742ak4), new com.tencent.mm.ui.chatting.e4(this), null, com.tencent.mm.ui.fb.GREEN);
        sb5.z zVar = (sb5.z) dVar.f460708c.a(sb5.z.class);
        ((com.tencent.mm.ui.chatting.adapter.k) zVar).X = new com.tencent.mm.ui.chatting.f4(this, zVar);
    }
}
