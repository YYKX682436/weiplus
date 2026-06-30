package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public final class a3 implements d45.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI f191511a;

    public a3(com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI) {
        this.f191511a = fileSelectorUI;
    }

    @Override // d45.d
    public void a(int i17, boolean z17) {
        boolean z18 = i17 < 5;
        com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI = this.f191511a;
        if (z17) {
            if (z18) {
                fileSelectorUI.f191381u.f191524a.f60199m++;
                return;
            } else {
                fileSelectorUI.f191381u.f191524a.f60200n++;
                return;
            }
        }
        if (z18) {
            fileSelectorUI.f191381u.f191524a.f60199m--;
        } else {
            fileSelectorUI.f191381u.f191524a.f60200n--;
        }
    }

    @Override // d45.d
    public void b(int i17, android.view.View view, int i18) {
        this.f191511a.f191381u.f191524a.f60195i = 1L;
    }
}
