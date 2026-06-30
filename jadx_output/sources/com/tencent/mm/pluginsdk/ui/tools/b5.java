package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class b5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f191527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI f191528e;

    public b5(com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI miniQBReaderUI, int i17) {
        this.f191528e = miniQBReaderUI;
        this.f191527d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI.R;
        this.f191528e.Y6(this.f191527d);
    }
}
