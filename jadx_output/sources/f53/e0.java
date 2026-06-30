package f53;

/* loaded from: classes5.dex */
public final class e0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI f259643d;

    public e0(com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI) {
        this.f259643d = postCommentDialogUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI = this.f259643d;
        com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig = postCommentDialogUI.f140023s;
        boolean z17 = gameInputConfig != null && gameInputConfig.canShowAtSomeoneView;
        f53.s sVar = postCommentDialogUI.D;
        if (z17) {
            if (postCommentDialogUI.f140028x) {
                com.tencent.mm.ui.widget.MMEditText mMEditText = postCommentDialogUI.f140012e;
                if (mMEditText == null) {
                    kotlin.jvm.internal.o.o("gameCommentInputTxt");
                    throw null;
                }
                postCommentDialogUI.V6(mMEditText.getSelectionStart(), false, "");
                postCommentDialogUI.f140028x = false;
            }
            if (postCommentDialogUI.f140029y) {
                postCommentDialogUI.Y6();
                postCommentDialogUI.f140029y = false;
            }
            if (sVar.f259687a) {
                postCommentDialogUI.W6().n1(sVar.f259688b);
            }
        }
        if (editable != null) {
            if (!(r26.n0.u0(editable.toString()).toString().length() == 0)) {
                android.widget.Button button = postCommentDialogUI.f140017m;
                if (button == null) {
                    kotlin.jvm.internal.o.o("btSendComment");
                    throw null;
                }
                button.setEnabled(true);
                android.widget.Button button2 = postCommentDialogUI.f140017m;
                if (button2 != null) {
                    button2.setVisibility(0);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("btSendComment");
                    throw null;
                }
            }
            com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig2 = postCommentDialogUI.f140023s;
            if (gameInputConfig2 != null && gameInputConfig2.canShowAtSomeoneView) {
                sVar.f259690d.clear();
                ((java.util.ArrayList) sVar.f259689c).clear();
                sVar.f259691e.clear();
                postCommentDialogUI.W6().setSelectedDatas(sVar.f259689c);
                postCommentDialogUI.W6().n1("");
                android.view.View view = postCommentDialogUI.f140019o;
                if (view == null) {
                    kotlin.jvm.internal.o.o("atSomeoneLayout");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$init$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$init$1", "afterTextChanged", "(Landroid/text/Editable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.Button button3 = postCommentDialogUI.f140017m;
            if (button3 == null) {
                kotlin.jvm.internal.o.o("btSendComment");
                throw null;
            }
            button3.setEnabled(false);
            com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig3 = postCommentDialogUI.f140023s;
            if (gameInputConfig3 != null && gameInputConfig3.hideImgBtn) {
                android.widget.ImageView imageView = postCommentDialogUI.f140015h;
                if (imageView == null) {
                    kotlin.jvm.internal.o.o("ivPicIcon");
                    throw null;
                }
                imageView.setVisibility(8);
            } else {
                android.widget.ImageView imageView2 = postCommentDialogUI.f140015h;
                if (imageView2 == null) {
                    kotlin.jvm.internal.o.o("ivPicIcon");
                    throw null;
                }
                imageView2.setVisibility(0);
            }
            android.widget.Button button4 = postCommentDialogUI.f140017m;
            if (button4 != null) {
                button4.setVisibility(8);
            } else {
                kotlin.jvm.internal.o.o("btSendComment");
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r6.canShowAtSomeoneView == true) goto L8;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void beforeTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r5 = r4.f259643d
            com.tencent.mm.plugin.game.api.GameInputConfig r6 = r5.f140023s
            r7 = 0
            if (r6 == 0) goto Ld
            boolean r6 = r6.canShowAtSomeoneView
            r8 = 1
            if (r6 != r8) goto Ld
            goto Le
        Ld:
            r8 = r7
        Le:
            if (r8 != 0) goto L11
            return
        L11:
            com.tencent.mm.ui.widget.MMEditText r6 = r5.f140012e
            java.lang.String r8 = "gameCommentInputTxt"
            r0 = 0
            if (r6 == 0) goto L6a
            android.text.Editable r6 = r6.getText()
            java.lang.String r1 = "getText(...)"
            kotlin.jvm.internal.o.f(r6, r1)
            com.tencent.mm.ui.widget.MMEditText r2 = r5.f140012e
            if (r2 == 0) goto L66
            int r2 = r2.getSelectionStart()
            java.lang.CharSequence r6 = r6.subSequence(r7, r2)
            java.lang.String r6 = r6.toString()
            r2 = 8197(0x2005, float:1.1486E-41)
            r3 = 2
            boolean r6 = r26.n0.E(r6, r2, r7, r3, r0)
            r5.f140028x = r6
            com.tencent.mm.ui.widget.MMEditText r6 = r5.f140012e
            if (r6 == 0) goto L62
            android.text.Editable r6 = r6.getText()
            kotlin.jvm.internal.o.f(r6, r1)
            com.tencent.mm.ui.widget.MMEditText r1 = r5.f140012e
            if (r1 == 0) goto L5e
            int r8 = r1.getSelectionStart()
            java.lang.CharSequence r6 = r6.subSequence(r7, r8)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = "@"
            boolean r6 = r26.i0.o(r6, r8, r7, r3, r0)
            r5.f140029y = r6
            return
        L5e:
            kotlin.jvm.internal.o.o(r8)
            throw r0
        L62:
            kotlin.jvm.internal.o.o(r8)
            throw r0
        L66:
            kotlin.jvm.internal.o.o(r8)
            throw r0
        L6a:
            kotlin.jvm.internal.o.o(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f53.e0.beforeTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI = this.f259643d;
        com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig = postCommentDialogUI.f140023s;
        if (!(gameInputConfig != null && gameInputConfig.canShowAtSomeoneView)) {
            return;
        }
        f53.s sVar = postCommentDialogUI.D;
        if (i19 != 0) {
            postCommentDialogUI.f140028x = false;
            postCommentDialogUI.f140029y = false;
            java.lang.String substring = java.lang.String.valueOf(charSequence).substring(i17, i17 + i19);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            if (!r26.n0.C(substring, (char) 8197, false, 2, null)) {
                for (java.util.Map.Entry entry : sVar.f259691e.entrySet()) {
                    if (i17 <= ((java.lang.Number) ((jz5.l) entry.getValue()).f302833d).intValue()) {
                        entry.setValue(new jz5.l(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.l) entry.getValue()).f302833d).intValue() + i19), java.lang.Integer.valueOf(((java.lang.Number) ((jz5.l) entry.getValue()).f302834e).intValue() + i19)));
                    }
                }
            }
            if (kotlin.jvm.internal.o.b(substring, " ") || (!sVar.f259687a && !r26.n0.C(substring, (char) 8197, false, 2, null))) {
                android.view.View view = postCommentDialogUI.f140019o;
                if (view == null) {
                    kotlin.jvm.internal.o.o("atSomeoneLayout");
                    throw null;
                }
                if (view.getVisibility() == 0) {
                    postCommentDialogUI.Y6();
                    return;
                }
            }
            if (sVar.f259687a) {
                java.lang.String str = sVar.f259688b + substring;
                kotlin.jvm.internal.o.g(str, "<set-?>");
                sVar.f259688b = str;
            }
            if (kotlin.jvm.internal.o.b(substring, "@")) {
                android.view.View view2 = postCommentDialogUI.f140019o;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("atSomeoneLayout");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI", "updateAtPosInfo", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI", "updateAtPosInfo", "(Ljava/lang/CharSequence;III)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                sVar.f259688b = "";
                sVar.f259687a = true;
                com.tencent.mm.game.report.l.c(postCommentDialogUI.getContext(), 101, 1, 0, 1, 0, null);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.o.b(sVar.f259688b, "")) {
            if (sVar.f259688b.length() - i18 <= 0) {
                sVar.f259688b = "";
                return;
            }
            java.lang.String str2 = sVar.f259688b;
            java.lang.String substring2 = str2.substring(0, str2.length() - i18);
            kotlin.jvm.internal.o.f(substring2, "substring(...)");
            sVar.f259688b = substring2;
            return;
        }
        java.util.Iterator it = sVar.f259691e.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.util.List<java.lang.String> list = sVar.f259689c;
            if (!hasNext) {
                postCommentDialogUI.W6().setSelectedDatas(list);
                sVar.f259687a = false;
                return;
            }
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            java.util.Map.Entry entry2 = (java.util.Map.Entry) next;
            int intValue = ((java.lang.Number) ((jz5.l) entry2.getValue()).f302833d).intValue();
            java.util.HashMap hashMap = sVar.f259690d;
            if (intValue >= i17) {
                if (((java.lang.Number) ((jz5.l) entry2.getValue()).f302833d).intValue() >= i17 + i18) {
                    entry2.setValue(new jz5.l(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.l) entry2.getValue()).f302833d).intValue() - i18), java.lang.Integer.valueOf(((java.lang.Number) ((jz5.l) entry2.getValue()).f302834e).intValue() - i18)));
                } else {
                    it.remove();
                    ((java.util.ArrayList) list).remove(entry2.getKey());
                    java.lang.Integer num = (java.lang.Integer) hashMap.get(entry2.getKey());
                    if (num != null) {
                        postCommentDialogUI.W6().l1(num.intValue());
                    }
                    hashMap.remove(entry2.getKey());
                }
            } else if (((java.lang.Number) ((jz5.l) entry2.getValue()).f302834e).intValue() >= i17 + i18) {
                it.remove();
                ((java.util.ArrayList) list).remove(entry2.getKey());
                java.lang.Integer num2 = (java.lang.Integer) hashMap.get(entry2.getKey());
                if (num2 != null) {
                    postCommentDialogUI.W6().l1(num2.intValue());
                }
                hashMap.remove(entry2.getKey());
            }
        }
    }
}
