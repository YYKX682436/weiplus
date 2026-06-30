package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class l7 implements com.tencent.mm.pluginsdk.ui.chat.kb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.c8 f190463a;

    public l7(com.tencent.mm.pluginsdk.ui.chat.c8 c8Var) {
        this.f190463a = c8Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.kb
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("ChatFooterKt", "fullTextWetypeGuideHolder onclick, hasRed:" + z17);
        u35.c cVar = u35.c.f424434a;
        com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = this.f190463a;
        if (z17) {
            cVar.b(9, c8Var.f190220b.getChattingContext() != null ? c8Var.e() : null, c8Var.f190244z, c8Var.j().b());
        } else {
            cVar.b(7, c8Var.f190220b.getChattingContext() != null ? c8Var.e() : null, c8Var.f190244z, c8Var.j().b());
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.kb
    public void b(boolean z17) {
        i45.j jVar = i45.j.f288415a;
        com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype").putLong("mmkv_key_full_text_config_insert_last_time", c01.id.a());
        com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype").putLong("mmkv_key_full_text_config_insert_count", com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype").getLong("mmkv_key_full_text_config_insert_count", 0L) + 1);
        com.tencent.mars.xlog.Log.i("ChatFooterKt", "fullTextWetypeGuideHolder onExposure, hasRed:" + z17);
        u35.c cVar = u35.c.f424434a;
        com.tencent.mm.pluginsdk.ui.chat.c8 c8Var = this.f190463a;
        if (z17) {
            cVar.b(8, c8Var.f190220b.getChattingContext() != null ? c8Var.e() : null, c8Var.f190244z, c8Var.j().b());
        } else {
            cVar.b(6, c8Var.f190220b.getChattingContext() != null ? c8Var.e() : null, c8Var.f190244z, c8Var.j().b());
        }
    }
}
