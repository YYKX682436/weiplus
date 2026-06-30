package yk5;

/* loaded from: classes11.dex */
public class w implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.voicesearch.VoiceSearchResultUI f462918d;

    public w(com.tencent.mm.ui.voicesearch.VoiceSearchResultUI voiceSearchResultUI) {
        this.f462918d = voiceSearchResultUI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/voicesearch/VoiceSearchResultUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.ui.voicesearch.VoiceSearchResultUI voiceSearchResultUI = this.f462918d;
        if (!voiceSearchResultUI.f211182o) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(voiceSearchResultUI.f211181n);
            sb6.append(",");
            sb6.append(voiceSearchResultUI.f211179i);
            sb6.append(",");
            java.lang.String[] strArr = voiceSearchResultUI.f211176f;
            sb6.append(strArr == null ? 0 : strArr.length);
            sb6.append(",");
            sb6.append(i17);
            g0Var.kvStat(10452, sb6.toString());
        }
        com.tencent.mm.storage.z3 item = voiceSearchResultUI.f211175e.getItem(i17);
        java.lang.String d17 = item.d1();
        java.lang.String g27 = item.g2();
        if (d17 != null && d17.length() > 0) {
            int i18 = voiceSearchResultUI.f211180m;
            if (i18 == 3) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Select_Conv_User", d17);
                voiceSearchResultUI.setResult(-1, intent);
                voiceSearchResultUI.finish();
            } else {
                if (i18 == 1 || c01.e2.U(d17) || c01.e2.G(d17) || com.tencent.mm.storage.z3.R4(d17) || c01.e2.M(d17)) {
                    str = "MicroMsg.VoiceSearchResultUI";
                    z17 = 1;
                } else {
                    android.database.Cursor[] cursorArr = new android.database.Cursor[2];
                    cursorArr[0] = c01.d9.b().A().a(c01.e2.f37121e, null, g27);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    while (cursorArr[0].moveToNext()) {
                        try {
                            android.database.Cursor cursor = cursorArr[0];
                            java.lang.String string = cursor.getString(cursor.getColumnIndex(dm.i4.COL_USERNAME));
                            arrayList2.add(string);
                            if (!com.tencent.mm.storage.z3.R4(string)) {
                                arrayList3.add(string);
                            }
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VoiceSearchResultUI", e17, "", new java.lang.Object[0]);
                        }
                    }
                    str = "MicroMsg.VoiceSearchResultUI";
                    z17 = 1;
                    android.database.Cursor c17 = c01.d9.b().z().c(g27, "@micromsg.with.all.biz.qq.com", null, arrayList2, false, true, true, 2, arrayList3);
                    cursorArr[1] = c17;
                    int count = c17.getCount();
                    int count2 = cursorArr[0].getCount();
                    cursorArr[0].close();
                    cursorArr[1].close();
                    if (!(count + count2 <= 1)) {
                        android.content.Intent intent2 = new android.content.Intent(voiceSearchResultUI, (java.lang.Class<?>) com.tencent.mm.ui.voicesearch.SearchConversationResultUI.class);
                        intent2.putExtra("SearchConversationResult_User", g27);
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(intent2);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(voiceSearchResultUI, arrayList4.toArray(), "com/tencent/mm/ui/voicesearch/VoiceSearchResultUI", "dealSelectContact", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        voiceSearchResultUI.startActivity((android.content.Intent) arrayList4.get(0));
                        yj0.a.f(voiceSearchResultUI, "com/tencent/mm/ui/voicesearch/VoiceSearchResultUI", "dealSelectContact", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
                int i19 = voiceSearchResultUI.f211180m;
                if (i19 == z17) {
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("Contact_User", d17);
                    if (c01.e2.M(d17)) {
                        intent3.putExtra("Is_group_card", z17);
                    }
                    if (d17.length() > 0) {
                        com.tencent.mm.ui.contact.g1.c(intent3, d17);
                        if (voiceSearchResultUI.f211183p) {
                            voiceSearchResultUI.startActivity(com.tencent.mm.ui.chatting.ChattingUI.class, new android.content.Intent().putExtra("Chat_User", d17).putExtra("finish_direct", z17));
                            voiceSearchResultUI.finish();
                        } else {
                            j45.l.j(voiceSearchResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent3, null);
                        }
                    }
                } else if (i19 == 2) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                        com.tencent.mars.xlog.Log.e(str, "username is null ".concat(d17));
                    } else if (com.tencent.mm.storage.z3.f4(d17)) {
                        if ((c01.z1.n() & 2) == 0 ? z17 : false) {
                            j45.l.j(voiceSearchResultUI.getContext(), "tmessage", ".ui.TConversationUI", new android.content.Intent().putExtra("finish_direct", z17), null);
                        } else {
                            j45.l.j(voiceSearchResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", d17), null);
                        }
                    } else if (com.tencent.mm.storage.z3.u4(d17)) {
                        j45.l.j(voiceSearchResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", d17), null);
                    } else if (com.tencent.mm.storage.z3.W3(d17)) {
                        j45.l.j(voiceSearchResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", d17), null);
                    } else if (com.tencent.mm.storage.z3.v4(d17)) {
                        ((com.tencent.mm.booter.notification.x) c01.d9.f()).h(d17);
                        j45.l.j(voiceSearchResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", d17), null);
                    } else if (com.tencent.mm.storage.z3.t4(d17)) {
                        if ((c01.z1.n() & z17) == 0 ? z17 : false) {
                            voiceSearchResultUI.startActivity(com.tencent.mm.ui.chatting.ChattingUI.class, new android.content.Intent().putExtra("Chat_User", d17).putExtra("finish_direct", z17));
                        } else {
                            j45.l.j(voiceSearchResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", d17), null);
                        }
                    } else if (com.tencent.mm.storage.z3.w4(d17)) {
                        if (c01.z1.E()) {
                            android.content.Intent intent4 = new android.content.Intent();
                            intent4.putExtra("type", 20);
                            j45.l.j(voiceSearchResultUI, "readerapp", ".ui.ReaderAppUI", intent4, null);
                        } else {
                            j45.l.j(voiceSearchResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", d17), null);
                        }
                    } else if (com.tencent.mm.storage.z3.x4(d17)) {
                        if ((c01.z1.n() & 262144) == 0 ? z17 : false) {
                            android.content.Intent intent5 = new android.content.Intent();
                            intent5.putExtra("type", 11);
                            j45.l.j(voiceSearchResultUI, "readerapp", ".ui.ReaderAppUI", intent5, null);
                        } else {
                            j45.l.j(voiceSearchResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", d17), null);
                        }
                    } else if (com.tencent.mm.storage.z3.Q3(d17)) {
                        j45.l.j(voiceSearchResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", d17), null);
                    } else if (com.tencent.mm.storage.z3.d4(d17)) {
                        if (c01.z1.D()) {
                            j45.l.j(voiceSearchResultUI, "masssend", ".ui.MassSendHistoryUI", new android.content.Intent().putExtra("finish_direct", z17), null);
                        } else {
                            j45.l.j(voiceSearchResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", d17), null);
                        }
                    } else if (com.tencent.mm.storage.z3.e4(d17)) {
                        if ((c01.z1.n() & 16) == 0 ? z17 : false) {
                            voiceSearchResultUI.startActivity(com.tencent.mm.ui.chatting.ChattingUI.class, new android.content.Intent().putExtra("Chat_User", d17).putExtra("finish_direct", z17));
                        } else {
                            j45.l.j(voiceSearchResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", d17), null);
                        }
                    } else {
                        if (!com.tencent.mm.storage.z3.c4(d17) && !com.tencent.mm.storage.z3.C4(d17)) {
                            if (!(d17.equalsIgnoreCase("feedsapp") ? z17 : false)) {
                                if (!(d17.equalsIgnoreCase("voipapp") ? z17 : false)) {
                                    if (!(d17.equalsIgnoreCase("voicevoipapp") ? z17 : false) && !com.tencent.mm.storage.z3.Y3(d17)) {
                                        if (!(d17.equalsIgnoreCase("qqfriend") ? z17 : false)) {
                                            voiceSearchResultUI.startActivity(com.tencent.mm.ui.chatting.ChattingUI.class, new android.content.Intent().putExtra("Chat_User", d17).putExtra("finish_direct", z17));
                                        }
                                    }
                                }
                            }
                        }
                        j45.l.j(voiceSearchResultUI, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", new android.content.Intent().putExtra("Contact_User", d17), null);
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/voicesearch/VoiceSearchResultUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
