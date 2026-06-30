package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public final class qe implements com.tencent.mm.ui.chatting.u9 {

    /* renamed from: d, reason: collision with root package name */
    public static final l75.v0 f202628d = new com.tencent.mm.ui.chatting.oe();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMFragment f202629a;

    /* renamed from: b, reason: collision with root package name */
    public final yb5.d f202630b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f202631c = new java.util.HashSet();

    public qe(yb5.d dVar) {
        this.f202629a = dVar.f460717l;
        this.f202630b = dVar;
    }

    public static void d(android.content.Context context, java.util.Set set) {
        java.lang.String str;
        if (set == null || set.size() <= 0) {
            str = null;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                sb6.append((java.lang.String) it.next());
                sb6.append(";");
            }
            str = sb6.toString();
        }
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.f193072b + "_tmp_preferences", 0).edit();
        edit.putString("transactions_array_key", str);
        edit.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x011c, code lost:
    
        if (r1 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0188, code lost:
    
        if (r35.j1.k(r7.getController(), r1.title, r1.thumbData, r1.description, b(r3), false, "", new com.tencent.mm.ui.chatting.pe(r31, r1, r3)) != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x029e, code lost:
    
        if (r35.j1.l(r7.getController(), r1.description, b(r3), false, "", new com.tencent.mm.ui.chatting.pe(r31, r1, r3)) != null) goto L76;
     */
    @Override // com.tencent.mm.ui.chatting.u9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.os.Bundle r32) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.qe.a(android.os.Bundle):void");
    }

    public final java.lang.String b(com.tencent.mm.pluginsdk.model.app.m mVar) {
        com.tencent.mm.ui.MMFragment mMFragment = this.f202629a;
        return mMFragment.getString(com.tencent.mm.R.string.f490942bb4, ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(mMFragment.getContext(), mVar));
    }

    public boolean c(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.opensdk.modelmsg.GetMessageFromWX.Req req = new com.tencent.mm.opensdk.modelmsg.GetMessageFromWX.Req();
        req.username = this.f202630b.x();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        req.transaction = kk.k.g(sb6.toString().getBytes());
        req.openId = str2;
        com.tencent.mm.ui.MMFragment mMFragment = this.f202629a;
        req.lang = com.tencent.mm.sdk.platformtools.m2.o(mMFragment.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), mMFragment.getContext());
        req.country = (java.lang.String) c01.d9.b().p().l(274436, null);
        android.os.Bundle bundle = new android.os.Bundle();
        req.toBundle(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.h(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.targetPkgName = str;
        args.bundle = bundle;
        args.flags = 268435456;
        boolean send = com.tencent.mm.opensdk.channel.MMessageActV2.send(mMFragment.getContext(), args);
        java.util.Set set = this.f202631c;
        ((java.util.HashSet) set).add(req.transaction);
        d(mMFragment.getContext(), set);
        return send;
    }
}
