package hn;

/* loaded from: classes4.dex */
public final class r implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg3.h3 f282374d;

    public r(vg3.h3 h3Var) {
        this.f282374d = h3Var;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent bindData) {
        kotlin.jvm.internal.o.g(bindData, "bindData");
        if (i17 == 15002 && i18 == -1) {
            java.lang.String stringExtra = bindData.getStringExtra("key_chat_room_open_id");
            vg3.h3 h3Var = this.f282374d;
            if (h3Var != null) {
                h3Var.a(true, null, stringExtra);
            }
        }
    }
}
