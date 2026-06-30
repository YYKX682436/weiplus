package vq;

/* loaded from: classes4.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439164d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f439164d = emojiDebugUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("version: " + jr.j.f301307c + '\n');
        sb6.append("type: " + jr.j.f301306b + '\n');
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("size: ");
        java.util.LinkedList linkedList = jr.j.f301308d;
        synchronized (linkedList) {
        }
        sb7.append(linkedList.size());
        sb7.append('\n');
        sb6.append(sb7.toString());
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("updateTime: ");
        int i17 = 0;
        gr.v.f274696a.a(false);
        sb8.append(com.tencent.mm.sdk.platformtools.t8.v(r3.b().getInt("word_list_update_time", 0)));
        sb8.append('\n');
        sb6.append(sb8.toString());
        synchronized (linkedList) {
        }
        sb6.append(kz5.n0.g0(linkedList, "\n", null, null, 0, null, null, 62, null));
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this.f439164d);
        u1Var.g(sb6.toString());
        u1Var.a(true);
        u1Var.q(false);
        android.database.Cursor f17 = com.tencent.mm.storage.n5.f().f195178p.f470812d.f("select * from EmojiSuggestCacheInfo", null, 2);
        java.lang.String str = z85.n.f470811g;
        if (f17 != null) {
            while (f17.moveToNext()) {
                jr.e eVar = new jr.e();
                eVar.convertFrom(f17);
                r45.hl5 hl5Var = new r45.hl5();
                byte[] bArr = eVar.field_content;
                if (bArr != null) {
                    try {
                        hl5Var.parseFrom(bArr);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                }
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("dump: ");
                sb9.append(i17);
                sb9.append(": ");
                sb9.append(eVar.field_desc);
                sb9.append(", ");
                sb9.append(eVar.field_updateTime);
                sb9.append("; ");
                java.util.LinkedList Emoji = hl5Var.f376267d;
                kotlin.jvm.internal.o.f(Emoji, "Emoji");
                sb9.append(kz5.n0.g0(Emoji, null, null, null, 0, null, z85.m.f470809d, 31, null));
                com.tencent.mars.xlog.Log.i(str, sb9.toString());
                i17++;
            }
            f17.close();
        }
        com.tencent.mars.xlog.Log.i(str, "dump done: count " + i17);
        return jz5.f0.f302826a;
    }
}
