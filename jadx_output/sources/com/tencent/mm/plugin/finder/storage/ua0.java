package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes4.dex */
public final class ua0 implements com.tencent.mm.plugin.finder.storage.uj0 {
    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public boolean a() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public com.tencent.mm.modelbase.m1 b(java.util.List nameList) {
        kotlin.jvm.internal.o.g(nameList, "nameList");
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        nameList.size();
        linkedList.addAll(nameList);
        cq.k1.a();
        boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.k1().r()).booleanValue();
        for (java.lang.String str : linkedList) {
            p(str, true);
            if (booleanValue) {
                com.tencent.mm.autogen.events.FinderHeartLikeRemoveByPrivacyEvent finderHeartLikeRemoveByPrivacyEvent = new com.tencent.mm.autogen.events.FinderHeartLikeRemoveByPrivacyEvent();
                java.util.List c17 = kz5.b0.c(str);
                am.jb jbVar = finderHeartLikeRemoveByPrivacyEvent.f54279g;
                jbVar.f7022a = c17;
                jbVar.f7023b = 1;
                finderHeartLikeRemoveByPrivacyEvent.e();
            }
        }
        gm0.j1.n().f273288b.a(3990, new com.tencent.mm.plugin.finder.storage.ra0(nameList, this));
        w11.h0 h0Var = new w11.h0(linkedList, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62, 1, ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMBatchModContactTypeMaxNumForServer", 30));
        gm0.j1.d().g(h0Var);
        return h0Var;
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public boolean c() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public com.tencent.mm.modelbase.m1 d(com.tencent.mm.protocal.protobuf.FinderContact contact, com.tencent.mm.plugin.finder.storage.tj0 tj0Var) {
        java.lang.String username;
        kotlin.jvm.internal.o.g(contact, "contact");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        contact.getUsername();
        java.lang.String username2 = contact.getUsername();
        if (username2 != null) {
            linkedList.add(username2);
        }
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMBatchModContactTypeMaxNumForServer", 30);
        gm0.j1.n().f273288b.a(3990, new com.tencent.mm.plugin.finder.storage.ta0(tj0Var));
        cq.k1.a();
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.k1().r()).booleanValue() && (username = contact.getUsername()) != null) {
            com.tencent.mm.autogen.events.FinderHeartLikeRemoveByPrivacyEvent finderHeartLikeRemoveByPrivacyEvent = new com.tencent.mm.autogen.events.FinderHeartLikeRemoveByPrivacyEvent();
            java.util.List c17 = kz5.b0.c(username);
            am.jb jbVar = finderHeartLikeRemoveByPrivacyEvent.f54279g;
            jbVar.f7022a = c17;
            jbVar.f7023b = 0;
            finderHeartLikeRemoveByPrivacyEvent.e();
        }
        w11.h0 h0Var = new w11.h0(linkedList, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62, 2, b17);
        gm0.j1.d().g(h0Var);
        return h0Var;
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public java.lang.CharSequence e(android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        return o(context, z17);
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public java.lang.CharSequence f(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return o(context, false);
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public java.util.LinkedList g() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.database.Cursor U = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().U(null, "", "@finder.block.his.liked.android", "", null);
        com.tencent.mars.xlog.Log.i("FinderNotSeeHimListConfig", "count = " + U.getCount());
        while (U.moveToNext()) {
            com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
            z3Var.convertFrom(U);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
            finderContact.setUsername(z3Var.d1());
            linkedList.add(finderContact);
        }
        return linkedList;
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public /* bridge */ /* synthetic */ x51.h h() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public java.lang.CharSequence i() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        int dimension = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
        java.lang.String string = context.getString(com.tencent.mm.R.string.erq);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return hc2.x0.k(string, context, '#', com.tencent.mm.R.raw.icons_filled_channels_like_bold, com.tencent.mm.R.color.FG_0, dimension, dimension, 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null);
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public java.util.Set j(java.util.List contacts, com.tencent.mm.plugin.finder.storage.tj0 tj0Var) {
        kotlin.jvm.internal.o.g(contacts, "contacts");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = contacts.iterator();
        while (it.hasNext()) {
            java.lang.String username = ((com.tencent.mm.protocal.protobuf.FinderContact) it.next()).getUsername();
            if (username != null) {
                linkedList.add(username);
            }
        }
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMBatchModContactTypeMaxNumForServer", 30);
        gm0.j1.n().f273288b.a(3990, new com.tencent.mm.plugin.finder.storage.sa0(tj0Var));
        cq.k1.a();
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.k1().r()).booleanValue()) {
            com.tencent.mm.autogen.events.FinderHeartLikeRemoveByPrivacyEvent finderHeartLikeRemoveByPrivacyEvent = new com.tencent.mm.autogen.events.FinderHeartLikeRemoveByPrivacyEvent();
            am.jb jbVar = finderHeartLikeRemoveByPrivacyEvent.f54279g;
            jbVar.f7022a = linkedList;
            jbVar.f7023b = 0;
            finderHeartLikeRemoveByPrivacyEvent.e();
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.clear();
        int i17 = 0;
        while (i17 < linkedList.size()) {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            for (int i18 = 0; i17 < linkedList.size() && i18 < b17; i18++) {
                linkedList2.add(linkedList.get(i18));
                i17++;
            }
            w11.h0 h0Var = new w11.h0(linkedList, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62, 2, b17);
            gm0.j1.d().g(h0Var);
            hashSet.add(h0Var);
        }
        return hashSet;
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public java.lang.CharSequence k(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return o(context, false);
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public void l(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).ij(context, null, "@finder.block.his.liked.android");
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public java.lang.CharSequence m() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.exn);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.storage.uj0
    public java.lang.CharSequence n() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.exo);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final java.lang.CharSequence o(android.content.Context context, boolean z17) {
        java.lang.String string = context.getString(com.tencent.mm.R.string.f491287cn1);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.d1j, string);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(string2);
        spannableString.setSpan(new com.tencent.mm.plugin.finder.view.yl(string, context.getResources().getColor(com.tencent.mm.R.color.Link_80), context.getResources().getColor(com.tencent.mm.R.color.a9e), false, false, new com.tencent.mm.plugin.finder.storage.qa0(z17, context)), 0, string.length(), 17);
        return spannableString;
    }

    public final void p(java.lang.String str, boolean z17) {
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 != null) {
            if (z17) {
                n17.setType(n17.getType() | com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62);
            } else {
                n17.setType(n17.getType() & (-33554433));
            }
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().p0(n17.d1(), n17);
        }
    }
}
