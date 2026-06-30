package qn4;

/* loaded from: classes12.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final qn4.y f365302a = new qn4.y();

    /* renamed from: b, reason: collision with root package name */
    public static final qn4.t f365303b = new qn4.t();

    /* renamed from: c, reason: collision with root package name */
    public static final qn4.m f365304c = new qn4.m();

    /* renamed from: d, reason: collision with root package name */
    public static final qn4.i f365305d = new qn4.i();

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.translate.speech.TranslationSpeechMenuItem$mVoipListener$1 f365306e;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.translate.speech.TranslationSpeechMenuItem$mVoipListener$1] */
    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f365306e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipCallingStatusEvent>(a0Var) { // from class: com.tencent.mm.plugin.translate.speech.TranslationSpeechMenuItem$mVoipListener$1
            {
                this.__eventId = 1965200980;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipCallingStatusEvent voipCallingStatusEvent) {
                com.tencent.mm.autogen.events.VoipCallingStatusEvent event = voipCallingStatusEvent;
                kotlin.jvm.internal.o.g(event, "event");
                int i17 = event.f54942g.f8161d;
                if (i17 != 2 && i17 != 7) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("TranslationSpeechMenuItem", "VoipCallingStatusEvent: voip started (status=" + i17 + "), stopping speech");
                qn4.y.d(4);
                return false;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(db5.g4 r8, int r9, android.content.Context r10, com.tencent.mm.storage.f9 r11) {
        /*
            java.lang.String r0 = "menu"
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r10, r0)
            java.lang.String r0 = "msg"
            kotlin.jvm.internal.o.g(r11, r0)
            boolean r0 = g()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1b
        L19:
            r0 = r2
            goto L3c
        L1b:
            java.lang.String r0 = r11.W0()
            if (r0 == 0) goto L2a
            int r0 = r0.length()
            if (r0 != 0) goto L28
            goto L2a
        L28:
            r0 = r2
            goto L2b
        L2a:
            r0 = r1
        L2b:
            if (r0 == 0) goto L2e
            goto L19
        L2e:
            boolean r0 = r11.i2()
            if (r0 == 0) goto L19
            boolean r0 = r11.b2()
            if (r0 != 0) goto L3b
            goto L19
        L3b:
            r0 = r1
        L3c:
            if (r0 == 0) goto Le4
            qn4.t r0 = qn4.y.f365303b
            boolean r3 = r0.f365279a
            if (r3 == 0) goto L4f
            long r3 = r0.f365280b
            long r5 = r11.getMsgId()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L4f
            goto L50
        L4f:
            r1 = r2
        L50:
            if (r1 == 0) goto L5a
            r0 = 2131782145(0x7f106a01, float:1.9195924E38)
            java.lang.String r0 = r10.getString(r0)
            goto L61
        L5a:
            r0 = 2131781810(0x7f1068b2, float:1.9195244E38)
            java.lang.String r0 = r10.getString(r0)
        L61:
            r6 = r0
            kotlin.jvm.internal.o.d(r6)
            r4 = 179(0xb3, float:2.51E-43)
            r5 = 0
            r7 = 2131692466(0x7f0f0bb2, float:1.9014033E38)
            r2 = r8
            r3 = r9
            r2.c(r3, r4, r5, r6, r7)
            java.lang.String r8 = com.tencent.mm.sdk.platformtools.m2.c(r10)
            java.lang.String r9 = "getActualTranslateLanguageIso(...)"
            kotlin.jvm.internal.o.f(r8, r9)
            r9 = 35268(0x89c4, float:4.9421E-41)
            java.lang.Class<dy1.r> r10 = dy1.r.class
            java.lang.String r0 = "translated_language"
            java.lang.String r2 = "chat_username"
            java.lang.String r3 = "msgid"
            java.lang.String r4 = "view_exp"
            java.lang.String r5 = "getTalker(...)"
            if (r1 == 0) goto Lb9
            java.lang.String r1 = r11.Q0()
            kotlin.jvm.internal.o.f(r1, r5)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            long r6 = r11.getMsgId()
            java.lang.String r11 = java.lang.String.valueOf(r6)
            r5.put(r3, r11)
            r5.put(r2, r1)
            r5.put(r0, r8)
            i95.m r8 = i95.n0.c(r10)
            dy1.r r8 = (dy1.r) r8
            cy1.a r8 = (cy1.a) r8
            java.lang.String r10 = "translate_stop_read_aloud_btn"
            r8.Hj(r10, r4, r5, r9)
            goto Le4
        Lb9:
            java.lang.String r1 = r11.Q0()
            kotlin.jvm.internal.o.f(r1, r5)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            long r6 = r11.getMsgId()
            java.lang.String r11 = java.lang.String.valueOf(r6)
            r5.put(r3, r11)
            r5.put(r2, r1)
            r5.put(r0, r8)
            i95.m r8 = i95.n0.c(r10)
            dy1.r r8 = (dy1.r) r8
            cy1.a r8 = (cy1.a) r8
            java.lang.String r10 = "translate_read_aloud_btn"
            r8.Hj(r10, r4, r5, r9)
        Le4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qn4.y.a(db5.g4, int, android.content.Context, com.tencent.mm.storage.f9):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x02b1, code lost:
    
        if (r4 == null) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x058d A[Catch: all -> 0x05bc, TryCatch #6 {all -> 0x05bc, blocks: (B:160:0x054a, B:165:0x055c, B:169:0x0569, B:189:0x0578, B:173:0x058d, B:174:0x0594, B:176:0x05b3, B:193:0x057e, B:202:0x059f, B:203:0x05a2, B:204:0x05a3, B:167:0x0565, B:198:0x059c), top: B:159:0x054a, outer: #0, inners: #2, #4, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05d8 A[Catch: all -> 0x0611, TryCatch #0 {all -> 0x0611, blocks: (B:177:0x05c7, B:180:0x05d0, B:182:0x05d8, B:183:0x060c, B:208:0x05bd, B:160:0x054a, B:165:0x055c, B:169:0x0569, B:189:0x0578, B:173:0x058d, B:174:0x0594, B:176:0x05b3, B:193:0x057e, B:202:0x059f, B:203:0x05a2, B:204:0x05a3), top: B:159:0x054a, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x004f A[Catch: all -> 0x00db, TryCatch #5 {all -> 0x00db, blocks: (B:13:0x0039, B:17:0x00d6, B:252:0x004f, B:255:0x0061, B:256:0x0065, B:258:0x006b, B:260:0x0077, B:261:0x007d, B:264:0x0081, B:267:0x0088, B:273:0x0092, B:274:0x0096, B:276:0x009c, B:278:0x00a8, B:279:0x00ae, B:282:0x00b2, B:285:0x00b8, B:291:0x00c2, B:293:0x00ce), top: B:12:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(android.content.Context r21, com.tencent.mm.storage.f9 r22, com.tencent.mm.ui.chatting.viewitems.er r23, yb5.d r24) {
        /*
            Method dump skipped, instructions count: 1638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qn4.y.c(android.content.Context, com.tencent.mm.storage.f9, com.tencent.mm.ui.chatting.viewitems.er, yb5.d):void");
    }

    public static final void d(int i17) {
        qn4.t tVar = f365303b;
        if (tVar.f365279a) {
            com.tencent.mars.xlog.Log.i("TranslationSpeechMenuItem", "stopIfPlaying: stopping active speech");
            tVar.f365286h = i17;
            f365302a.f();
        }
    }

    public static final boolean e(long j17, int i17) {
        qn4.t tVar = f365303b;
        boolean z17 = tVar.f365279a && tVar.f365280b == j17;
        com.tencent.mars.xlog.Log.i("TranslationSpeechMenuItem", "stopIfPlayingMsg: isPlaying=" + z17 + ", msgId=" + j17);
        if (!z17) {
            return false;
        }
        tVar.f365286h = i17;
        f365302a.f();
        return true;
    }

    public static final boolean g() {
        if (com.tencent.mm.app.plugin.k.a()) {
            return j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigTranslationSpeech()) == 1;
        }
        return false;
    }

    public final void b(android.view.View view, java.lang.Class cls, java.util.List list) {
        if (cls.isInstance(view) && view.getVisibility() == 0) {
            list.add(view);
            return;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
                b(childAt, cls, list);
            }
        }
    }

    public final void f() {
        f365303b.d();
        qn4.m mVar = f365304c;
        mVar.getClass();
        qn4.v vVar = qn4.v.f365297a;
        vVar.a(new qn4.j(mVar), new qn4.k(mVar));
        qn4.i iVar = f365305d;
        iVar.getClass();
        vVar.a(new qn4.c(iVar), null);
        f365306e.dead();
    }
}
