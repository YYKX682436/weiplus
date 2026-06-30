package kr3;

/* loaded from: classes11.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final kr3.s1 f311475a = new kr3.s1();

    public final void a(android.content.Intent intent, android.app.Activity context, java.lang.String str, java.lang.Class cls, java.lang.Integer num, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        if (cls == null) {
            return;
        }
        if (j62.e.g().c(new com.tencent.mm.repairer.config.remark.RepairerConfigProfileWxContact()) == 1) {
            if (kotlin.jvm.internal.o.b(cls, com.tencent.mm.plugin.profile.ui.mod.components.h.class)) {
                cls = com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.g.class;
            } else if (kotlin.jvm.internal.o.b(cls, com.tencent.mm.plugin.profile.ui.mod.components.j0.class)) {
                cls = com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0.class;
            } else if (kotlin.jvm.internal.o.b(cls, com.tencent.mm.plugin.profile.ui.mod.components.k1.class)) {
                cls = com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1.class;
            } else if (kotlin.jvm.internal.o.b(cls, com.tencent.mm.plugin.profile.ui.mod.components.x0.class)) {
                cls = com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.w0.class;
            } else if (kotlin.jvm.internal.o.b(cls, com.tencent.mm.plugin.profile.ui.mod.components.n1.class)) {
                cls = com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.m1.class;
            }
        }
        android.content.Intent intent2 = new android.content.Intent();
        if (intent != null) {
            intent2.replaceExtras(intent);
        }
        intent2.putStringArrayListExtra("key_intent_action_uic_list", new java.util.ArrayList<>());
        java.lang.String stringExtra = intent2.getStringExtra("Contact_User");
        if (stringExtra == null || r26.n0.N(stringExtra)) {
            if (!(str == null || r26.n0.N(str))) {
                intent2.putExtra("Contact_User", str);
            }
        }
        pf5.j0.a(intent2, cls);
        intent2.putStringArrayListExtra("key_intent_assemble_uic_list", kz5.c0.d(cls.getName()));
        intent2.putExtra("key_intent_assemble_ui_half_screen", true);
        java.lang.String d17 = kotlin.jvm.internal.i0.a(com.tencent.mm.plugin.profile.ui.mod.ContactAssembleModRemarkUI.class).d();
        if (d17 == null) {
            return;
        }
        bh5.c cVar = new bh5.c();
        cVar.d(intent2);
        cVar.f20922a.f20924a = context;
        cVar.a(d17);
        if (z17) {
            cVar.b(com.tencent.mm.plugin.profile.ui.mod.desc_image.WrapHalfScreenFragment.class);
        }
        if (num != null) {
            cVar.h(num.intValue());
        } else {
            cVar.g();
        }
    }
}
