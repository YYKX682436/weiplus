package com.tencent.mm.plugin.recordvideo.ui.editor.sticker;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/sticker/StickerEditorContainer;", "Landroid/widget/FrameLayout;", "Lqc0/g1;", "Ldl/f0;", "getCurrentArtist", "Lum/t;", "getCurrentItemCache", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "aw3/a", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class StickerEditorContainer extends android.widget.FrameLayout implements qc0.g1 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f156425h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f156426d;

    /* renamed from: e, reason: collision with root package name */
    public qk.o9 f156427e;

    /* renamed from: f, reason: collision with root package name */
    public ym5.y5 f156428f;

    /* renamed from: g, reason: collision with root package name */
    public qc0.p1 f156429g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerEditorContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f156426d = "MicroMsg.StickerEditor.Container[" + hashCode() + ']';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dl.f0 getCurrentArtist() {
        l45.q presenter;
        ym5.y5 y5Var = this.f156428f;
        if (y5Var == null || (presenter = y5Var.getPresenter()) == null) {
            return null;
        }
        ym5.y5 y5Var2 = this.f156428f;
        return (dl.f0) ((l45.n) presenter).d(y5Var2 != null ? y5Var2.getTargetFeatureType() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final um.t getCurrentItemCache() {
        dl.f0 currentArtist = getCurrentArtist();
        um.g gVar = currentArtist != null ? (um.g) currentArtist.d() : null;
        if (gVar instanceof um.t) {
            return (um.t) gVar;
        }
        return null;
    }

    public void d() {
        com.tencent.mars.xlog.Log.i(this.f156426d, "exitSticker");
        qk.o9 o9Var = this.f156427e;
        if (o9Var != null) {
            o9Var.f();
        }
        ym5.y5 y5Var = this.f156428f;
        l45.q presenter = y5Var != null ? y5Var.getPresenter() : null;
        if (presenter != null) {
            ((l45.n) presenter).f316475p = null;
        }
        this.f156429g = null;
    }

    public final r45.ei0 e() {
        int i17;
        java.util.LinkedList linkedList;
        dl.f0 currentArtist = getCurrentArtist();
        com.tencent.mars.xlog.Log.i(this.f156426d, "genRestoreData: artist:" + currentArtist);
        r45.ei0 ei0Var = new r45.ei0();
        um.g gVar = currentArtist != null ? (um.g) currentArtist.d() : null;
        um.t tVar = gVar instanceof um.t ? (um.t) gVar : null;
        if (currentArtist == null || currentArtist.d() == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("generateEditorItemRestoreData: failed, artist:");
            sb6.append(currentArtist);
            sb6.append(", cache:");
            sb6.append(currentArtist != null ? (um.g) currentArtist.d() : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.StickerEditor.InitWorker", sb6.toString());
        } else {
            java.util.LinkedList l17 = tVar != null ? tVar.l() : null;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            float f17 = 0.5f;
            if (l17 == null) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("genTextItemRestoreData: failed, artist:");
                sb7.append(currentArtist);
                sb7.append(", itemList size=");
                sb7.append(l17 != null ? java.lang.Integer.valueOf(l17.size()) : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.StickerEditor.InitWorker", sb7.toString());
            } else {
                java.util.Iterator it = l17.iterator();
                while (it.hasNext()) {
                    xk0.o oVar = (xk0.o) it.next();
                    r45.ji0 ji0Var = new r45.ji0();
                    if (currentArtist.f235041c.width() == 0 || currentArtist.f235041c.height() == 0) {
                        ji0Var.f377822d = f17;
                        ji0Var.f377823e = f17;
                    } else {
                        ji0Var.f377822d = oVar.f454955m.x / currentArtist.f235041c.width();
                        ji0Var.f377823e = oVar.f454955m.y / currentArtist.f235041c.height();
                    }
                    ji0Var.f377824f = oVar.f454998J ? 2 : oVar.I != 0 ? 3 : 1;
                    int i18 = oVar.H;
                    java.lang.String format = java.lang.String.format("#%06X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i18 & 16777215)}, 1));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    ji0Var.f377825g = format;
                    java.lang.String format2 = java.lang.String.format("#%06X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(oVar.I & 16777215)}, 1));
                    kotlin.jvm.internal.o.f(format2, "format(...)");
                    ji0Var.f377826h = format2;
                    ji0Var.f377827i = oVar.f454957o;
                    ji0Var.f377828m = oVar.f454956n;
                    ji0Var.f377829n = oVar.L.toString();
                    android.graphics.Bitmap bitmap = oVar.f454952g;
                    ji0Var.f377830o = bitmap != null ? bitmap.getWidth() : 0;
                    android.graphics.Bitmap bitmap2 = oVar.f454952g;
                    ji0Var.f377831p = bitmap2 != null ? bitmap2.getHeight() : 0;
                    linkedList2.add(ji0Var);
                    com.tencent.mars.xlog.Log.i("MicroMsg.StickerEditor.InitWorker", "genTextItemRestoreData: mText=" + ((java.lang.Object) oVar.L) + ", scale=" + oVar.f454957o + ", mColor=" + i18 + ", mBgColor=" + oVar.I);
                    f17 = 0.5f;
                }
            }
            if (tVar != null) {
                linkedList = new java.util.LinkedList();
                java.util.Iterator it6 = tVar.e(true).iterator();
                while (it6.hasNext()) {
                    xk0.f fVar = (xk0.f) it6.next();
                    if (fVar instanceof xk0.n) {
                        linkedList.add(fVar);
                    }
                }
                i17 = 0;
                tVar.e(false).size();
                tVar.e(true).size();
                linkedList.size();
            } else {
                i17 = 0;
                linkedList = null;
            }
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            if (linkedList == null) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("genPictureItemRestoreData: failed, artists:");
                sb8.append(currentArtist);
                sb8.append(", itemList size=");
                sb8.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.StickerEditor.InitWorker", sb8.toString());
            } else {
                java.util.Iterator it7 = linkedList.iterator();
                while (it7.hasNext()) {
                    xk0.n nVar = (xk0.n) it7.next();
                    r45.gi0 gi0Var = new r45.gi0();
                    if (currentArtist.f235041c.width() == 0 || currentArtist.f235041c.height() == 0) {
                        gi0Var.f375268d = 0.5f;
                        gi0Var.f375269e = 0.5f;
                    } else {
                        gi0Var.f375268d = nVar.f454955m.x / currentArtist.f235041c.width();
                        gi0Var.f375269e = nVar.f454955m.y / currentArtist.f235041c.height();
                    }
                    gi0Var.f375270f = nVar.f454957o;
                    gi0Var.f375271g = nVar.f454956n;
                    gi0Var.f375272h = nVar.H;
                    java.lang.String str = nVar.I;
                    if (str == null) {
                        str = "";
                    }
                    gi0Var.f375273i = str;
                    android.graphics.Bitmap bitmap3 = nVar.f454952g;
                    gi0Var.f375274m = bitmap3 != null ? bitmap3.getWidth() : i17;
                    android.graphics.Bitmap bitmap4 = nVar.f454952g;
                    gi0Var.f375275n = bitmap4 != null ? bitmap4.getHeight() : i17;
                    linkedList3.add(gi0Var);
                }
            }
            ei0Var.f373529d = linkedList2;
            ei0Var.f373530e = linkedList3;
            com.tencent.mars.xlog.Log.i("MicroMsg.StickerEditor.InitWorker", "generateEditorItemRestoreData: textItem size=" + ei0Var.f373529d.size() + ", picItem size=" + ei0Var.f373530e.size());
        }
        return ei0Var;
    }

    public void f(qc0.p1 p1Var) {
        l45.q presenter;
        if (p1Var == null) {
            p1Var = this.f156429g;
        }
        java.lang.String str = this.f156426d;
        jz5.f0 f0Var = null;
        if (p1Var != null) {
            com.tencent.mars.xlog.Log.i(str, "generateSticker start on [" + java.lang.Thread.currentThread().getName() + ']');
            ym5.y5 y5Var = this.f156428f;
            if (y5Var != null && (presenter = y5Var.getPresenter()) != null) {
                ((l45.n) presenter).c();
            }
            l(false);
            qk.o9 o9Var = this.f156427e;
            if (o9Var != null) {
                o9Var.g(new aw3.a(p1Var, e()), true);
                f0Var = jz5.f0.f302826a;
            }
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i(str, "generateSticker: failed callback null");
        }
    }

    public final void g(int i17, r45.ei0 ei0Var) {
        boolean z17;
        dl.f0 currentArtist = getCurrentArtist();
        um.t currentItemCache = getCurrentItemCache();
        java.lang.String str = this.f156426d;
        if (currentArtist == null || currentItemCache == null) {
            com.tencent.mars.xlog.Log.i(str, "restore: artists or artistCache null");
            return;
        }
        aw3.i iVar = aw3.i.f14843a;
        if (ei0Var != null) {
            um.g gVar = (um.g) currentArtist.d();
            if (gVar.e(false) == null) {
                ((um.g) currentArtist.d()).R2(false);
            }
            kotlin.jvm.internal.o.f(gVar.e(false), "getStack(...)");
            if (!(!r6.isEmpty())) {
                java.util.LinkedList textItemRestoreDataList = ei0Var.f373529d;
                kotlin.jvm.internal.o.f(textItemRestoreDataList, "textItemRestoreDataList");
                java.util.LinkedList picItemRestoreDataList = ei0Var.f373530e;
                kotlin.jvm.internal.o.f(picItemRestoreDataList, "picItemRestoreDataList");
                com.tencent.mars.xlog.Log.i("MicroMsg.StickerEditor.InitWorker", "restoreEditorItemWithSnapShot: textItemList size=" + textItemRestoreDataList.size() + ", picItemList size=" + picItemRestoreDataList.size());
                if (i17 == 1) {
                    iVar.a(picItemRestoreDataList, i17, currentArtist);
                    iVar.b(textItemRestoreDataList, i17, currentArtist);
                } else if (i17 == 2) {
                    iVar.b(textItemRestoreDataList, i17, currentArtist);
                    iVar.a(picItemRestoreDataList, i17, currentArtist);
                }
                z17 = true;
                com.tencent.mars.xlog.Log.i(str, "restore result=" + z17 + ", save alive " + currentItemCache.A3(true) + " last " + currentItemCache.A3(false));
                currentArtist.r();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.StickerEditor.InitWorker", "restore skip");
        }
        z17 = false;
        com.tencent.mars.xlog.Log.i(str, "restore result=" + z17 + ", save alive " + currentItemCache.A3(true) + " last " + currentItemCache.A3(false));
        currentArtist.r();
    }

    public r45.ei0 h(int i17, r45.ei0 restoreData, android.graphics.Bitmap bitmap) {
        xk0.o k17;
        xk0.o k18;
        kotlin.jvm.internal.o.g(restoreData, "restoreData");
        java.lang.String str = this.f156426d;
        if (bitmap != null) {
            java.util.LinkedList textItemRestoreDataList = restoreData.f373529d;
            kotlin.jvm.internal.o.f(textItemRestoreDataList, "textItemRestoreDataList");
            r45.ji0 ji0Var = (r45.ji0) kz5.n0.Z(textItemRestoreDataList);
            java.lang.String str2 = ji0Var != null ? ji0Var.f377829n : null;
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Boolean.TRUE);
            arrayList.add(config);
            java.util.Collections.reverse(arrayList);
            java.lang.String str3 = str2;
            yj0.a.d(bitmap, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/sticker/StickerEditorContainer", "replaceTextBitmap", "(ILcom/tencent/mm/protocal/protobuf/EditorItemRestoreData;Landroid/graphics/Bitmap;)Lcom/tencent/mm/protocal/protobuf/EditorItemRestoreData;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap copy = bitmap.copy((android.graphics.Bitmap.Config) arrayList.get(0), ((java.lang.Boolean) arrayList.get(1)).booleanValue());
            yj0.a.e(bitmap, copy, "com/tencent/mm/plugin/recordvideo/ui/editor/sticker/StickerEditorContainer", "replaceTextBitmap", "(ILcom/tencent/mm/protocal/protobuf/EditorItemRestoreData;Landroid/graphics/Bitmap;)Lcom/tencent/mm/protocal/protobuf/EditorItemRestoreData;", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
            um.t currentItemCache = getCurrentItemCache();
            xk0.o k19 = currentItemCache != null ? currentItemCache.k(true) : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("replaceTextBitmap stickerTextItem size:");
            um.t currentItemCache2 = getCurrentItemCache();
            sb6.append(currentItemCache2 != null ? java.lang.Integer.valueOf(currentItemCache2.l().size()) : null);
            sb6.append(" aliveStickerItem:");
            sb6.append(k19);
            sb6.append(", targetType:");
            sb6.append(i17);
            sb6.append(", text:");
            sb6.append(str3);
            sb6.append("，textBitmap:");
            sb6.append(bitmap);
            sb6.append("(memory:");
            sb6.append(bitmap.getByteCount());
            sb6.append(",size:");
            sb6.append(bitmap.getWidth());
            sb6.append('*');
            sb6.append(bitmap.getHeight());
            sb6.append("),copyBitmap:");
            sb6.append(copy);
            sb6.append("(memory:");
            sb6.append(copy.getByteCount());
            sb6.append(",size:");
            sb6.append(copy.getWidth());
            sb6.append('*');
            sb6.append(copy.getHeight());
            sb6.append(')');
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            if (k19 != null) {
                k19.H(copy, str3);
            } else {
                g(i17, restoreData);
                um.t currentItemCache3 = getCurrentItemCache();
                if (currentItemCache3 != null && (k18 = currentItemCache3.k(false)) != null) {
                    k18.H(copy, str3);
                }
                um.t currentItemCache4 = getCurrentItemCache();
                if (currentItemCache4 != null) {
                    currentItemCache4.f3(false);
                }
            }
        } else {
            um.t currentItemCache5 = getCurrentItemCache();
            xk0.o k27 = currentItemCache5 != null ? currentItemCache5.k(true) : null;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("replaceTextBitmap stickerTextItem size:");
            um.t currentItemCache6 = getCurrentItemCache();
            sb7.append(currentItemCache6 != null ? java.lang.Integer.valueOf(currentItemCache6.l().size()) : null);
            sb7.append(",clear!");
            com.tencent.mars.xlog.Log.i(str, sb7.toString());
            if (k27 != null) {
                k27.clear();
            } else {
                g(i17, restoreData);
                um.t currentItemCache7 = getCurrentItemCache();
                if (currentItemCache7 != null && (k17 = currentItemCache7.k(false)) != null) {
                    k17.clear();
                }
                um.t currentItemCache8 = getCurrentItemCache();
                if (currentItemCache8 != null) {
                    currentItemCache8.f3(false);
                }
            }
        }
        return e();
    }

    public r45.ei0 i(int i17, float f17, float f18) {
        xk0.f k17;
        um.t currentItemCache;
        if (i17 != 1) {
            if (i17 == 2 && (currentItemCache = getCurrentItemCache()) != null) {
                k17 = currentItemCache.j(true);
            }
            k17 = null;
        } else {
            um.t currentItemCache2 = getCurrentItemCache();
            if (currentItemCache2 != null) {
                k17 = currentItemCache2.k(true);
            }
            k17 = null;
        }
        if (k17 == null) {
            return null;
        }
        k17.v(f17, f18);
        return e();
    }

    public void j(boolean z17, float f17) {
        xk0.o k17;
        com.tencent.mars.xlog.Log.i(this.f156426d, "showTextInput customInputViewTextSize:" + f17);
        ym5.y5 y5Var = this.f156428f;
        if (y5Var != null) {
            if (f17 > 0.0f) {
                y5Var.f463582y = f17;
                com.tencent.mm.view.PhotoEditText photoEditText = y5Var.f463357t;
                com.tencent.mm.view.StickerEditText stickerEditText = photoEditText instanceof com.tencent.mm.view.StickerEditText ? (com.tencent.mm.view.StickerEditText) photoEditText : null;
                if (stickerEditText != null) {
                    stickerEditText.setTextSize(f17);
                }
            }
            um.t currentItemCache = getCurrentItemCache();
            if (currentItemCache == null || (k17 = currentItemCache.k(true)) == null) {
                return;
            }
            java.util.Objects.toString(k17.L);
            float f18 = k17.f454955m.x;
            dl.f0 currentArtist = getCurrentArtist();
            if (currentArtist != null) {
                currentArtist.J(k17);
            }
        }
    }

    public final void k(r45.ee6 configData, qc0.p1 callback) {
        l45.q presenter;
        kotlin.jvm.internal.o.g(configData, "configData");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String str = this.f156426d;
        com.tencent.mars.xlog.Log.i(str, "startInit: ");
        r45.ii0 ii0Var = configData.f373371g;
        android.graphics.Rect rect = new android.graphics.Rect(ii0Var.f377059d, ii0Var.f377060e, ii0Var.f377061f, ii0Var.f377062g);
        r45.fi0 fi0Var = configData.f373370f;
        android.graphics.Rect rect2 = new android.graphics.Rect(fi0Var.f374374d, fi0Var.f374375e, fi0Var.f374376f, fi0Var.f374377g);
        com.tencent.mars.xlog.Log.i(str, "initEditor safeRect=" + rect + ", outputRect=" + rect2);
        ((wb0.e) ((xb0.e) i95.n0.c(xb0.e.class))).getClass();
        rj.l lVar = new rj.l();
        this.f156427e = lVar;
        qk.l9 l9Var = new qk.l9();
        l9Var.f364232b = false;
        l9Var.f364233c = false;
        l9Var.f364237g = false;
        l9Var.f364231a = qk.n9.LIVE_STICKER;
        l9Var.f364236f = rect2;
        l9Var.f364234d = str;
        lVar.d(l9Var);
        qk.o9 o9Var = this.f156427e;
        qk.s c17 = o9Var != null ? o9Var.c(getContext()) : null;
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.view.StickerDrawingView");
        ym5.y5 y5Var = (ym5.y5) c17;
        this.f156428f = y5Var;
        r45.fi0 fi0Var2 = configData.f373370f;
        android.graphics.Rect rect3 = new android.graphics.Rect(fi0Var2.f374374d, fi0Var2.f374375e, fi0Var2.f374376f, fi0Var2.f374377g);
        float f17 = configData.f373369e;
        bn5.m mVar = (bn5.m) y5Var.getBaseBoardView();
        if (mVar != null) {
            mVar.setFinalGenerateBitmapOutputRect(rect3);
        }
        ((l45.n) y5Var.getPresenter()).x(rect3.right - rect3.left, rect3.bottom - rect3.top);
        ((l45.n) y5Var.getPresenter()).f316477r = new cm5.g(f17, f17, null, 4, null);
        com.tencent.mars.xlog.Log.i(str, "initDrawingView: outputBitmapRect=" + rect3);
        int i17 = configData.f373375n;
        y5Var.setBottomControlBarMode(i17 != 1 ? i17 != 2 ? ym5.n5.f463445d : ym5.n5.f463447f : ym5.n5.f463446e);
        r45.ci0 ci0Var = configData.f373373i;
        int i18 = ci0Var.f371565d;
        int i19 = ci0Var.f371566e;
        int i27 = ci0Var.f371567f;
        int i28 = ci0Var.f371568g;
        c01.r2 r2Var = new c01.r2(i18, i19, i27, i28);
        android.view.View view = y5Var.f463351n;
        if (view != null && y5Var.I != null) {
            y5Var.G = r2Var;
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.d8f);
            android.view.View findViewById2 = y5Var.f463351n.findViewById(com.tencent.mm.R.id.auj);
            android.view.ViewGroup.LayoutParams layoutParams = findViewById != null ? findViewById.getLayoutParams() : null;
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.topMargin += i19;
                findViewById.setLayoutParams(layoutParams2);
            }
            android.view.ViewGroup.LayoutParams layoutParams3 = findViewById2 != null ? findViewById2.getLayoutParams() : null;
            android.widget.RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.bottomMargin += i28;
                findViewById2.setLayoutParams(layoutParams4);
            }
            android.view.View view2 = y5Var.I;
            android.view.ViewGroup.LayoutParams layoutParams5 = view2 != null ? view2.getLayoutParams() : null;
            android.widget.FrameLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams5 : null;
            if (layoutParams6 != null) {
                layoutParams6.bottomMargin = i65.a.h(y5Var.getContext(), com.tencent.mm.R.dimen.f479688cn) + i28;
                android.view.View view3 = y5Var.I;
                if (view3 != null) {
                    view3.setLayoutParams(layoutParams6);
                }
            }
        }
        y5Var.h(configData.f373373i.f371569h);
        float f18 = configData.f373373i.f371570i;
        if (f18 > 0.0f) {
            y5Var.f463582y = f18;
            com.tencent.mm.view.PhotoEditText photoEditText = y5Var.f463357t;
            com.tencent.mm.view.StickerEditText stickerEditText = photoEditText instanceof com.tencent.mm.view.StickerEditText ? (com.tencent.mm.view.StickerEditText) photoEditText : null;
            if (stickerEditText != null) {
                stickerEditText.setTextSize(f18);
            }
        }
        r45.ci0 ci0Var2 = configData.f373373i;
        int i29 = ci0Var2.f371571m;
        int i37 = ci0Var2.f371572n;
        com.tencent.mm.view.PhotoEditText photoEditText2 = y5Var.f463357t;
        com.tencent.mm.view.StickerEditText stickerEditText2 = photoEditText2 instanceof com.tencent.mm.view.StickerEditText ? (com.tencent.mm.view.StickerEditText) photoEditText2 : null;
        if (stickerEditText2 != null) {
            stickerEditText2.d(i29);
            if (i37 > 0 && !kotlin.jvm.internal.o.b("\u3000", "")) {
                android.graphics.Paint paint = new android.graphics.Paint();
                paint.setTextSize(stickerEditText2.getTextSize());
                stickerEditText2.setMaxWidth((int) ((paint.measureText("\u3000") * i37) + stickerEditText2.getPaddingLeft() + stickerEditText2.getPaddingRight()));
            }
        }
        addView(y5Var);
        r45.ii0 safeRect = configData.f373371g;
        kotlin.jvm.internal.o.f(safeRect, "safeRect");
        dl.f0 currentArtist = getCurrentArtist();
        if (currentArtist != null) {
            int i38 = safeRect.f377059d;
            int i39 = safeRect.f377060e;
            int i47 = safeRect.f377061f;
            int i48 = safeRect.f377062g;
            android.graphics.Matrix h17 = currentArtist.h();
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            h17.invert(matrix);
            android.graphics.RectF rectF = new android.graphics.RectF(i38, i39, i47, i48);
            matrix.mapRect(rectF);
            currentArtist.f235042d = new android.graphics.Rect(java.lang.Math.round(rectF.left), java.lang.Math.round(rectF.top), java.lang.Math.round(rectF.right), java.lang.Math.round(rectF.bottom));
        }
        int i49 = configData.f373368d;
        r45.ei0 editorItemRestoreData = configData.f373372h;
        kotlin.jvm.internal.o.f(editorItemRestoreData, "editorItemRestoreData");
        g(i49, editorItemRestoreData);
        this.f156429g = callback;
        ym5.y5 y5Var2 = this.f156428f;
        if (y5Var2 != null) {
            y5Var2.setCancelDrawCallback(new aw3.c(this, callback, configData));
        }
        ym5.y5 y5Var3 = this.f156428f;
        if (y5Var3 != null) {
            y5Var3.setConfirmDrawCallback(new aw3.d(this, callback));
        }
        ym5.y5 y5Var4 = this.f156428f;
        if (y5Var4 != null && (presenter = y5Var4.getPresenter()) != null) {
            ((l45.n) presenter).f316475p = new aw3.e(this, callback);
        }
        int i57 = configData.f373368d;
        if (i57 != 1) {
            if (i57 != 2) {
                return;
            }
            com.tencent.mars.xlog.Log.i(str, "handlePictureItem: ");
            l(true);
            post(new aw3.b(this));
            return;
        }
        l(true);
        um.t currentItemCache = getCurrentItemCache();
        xk0.o k17 = currentItemCache != null ? currentItemCache.k(false) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleTextItem: lastTextItem exist=");
        sb6.append(k17 != null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        ym5.y5 y5Var5 = this.f156428f;
        if (y5Var5 != null) {
            l45.n nVar = (l45.n) y5Var5.getPresenter();
            nVar.getClass();
            new l45.a(nVar).a(y5Var5.getTargetFeatureType());
            if (k17 == null) {
                ((l45.n) y5Var5.getPresenter()).u();
                y5Var5.getTextEditView().requestFocus();
                y5Var5.getTextEditView().postDelayed(new ym5.x5(y5Var5), y5Var5.C);
            } else {
                ym5.y5.e(y5Var5, c01.s2.f37434g, false, 2, null);
                k17.w(true);
                ym5.y5 y5Var6 = this.f156428f;
                if (y5Var6 != null) {
                    y5Var6.j();
                }
            }
        }
    }

    public final void l(boolean z17) {
        int visibility = getVisibility();
        int i17 = z17 ? 0 : 8;
        setVisibility(i17);
        com.tencent.mars.xlog.Log.i(this.f156426d, "updateSelfVisibility: from " + visibility + " to " + i17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mars.xlog.Log.i(this.f156426d, "onAttachedToWindow: ");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i(this.f156426d, "onDetachedFromWindow: ");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerEditorContainer(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f156426d = "MicroMsg.StickerEditor.Container[" + hashCode() + ']';
    }
}
