package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class DialPad extends android.widget.RelativeLayout implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f142521i = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f142522m = {"", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", "", "+", ""};

    /* renamed from: d, reason: collision with root package name */
    public boolean f142523d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f142524e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f142525f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f142526g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.b f142527h;

    public DialPad(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f142523d = false;
        this.f142524e = new java.util.HashMap();
        this.f142525f = new java.util.HashMap();
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f142526g = hashMap;
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488708a46, this);
        float dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480536a30);
        float dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480538a32);
        float dimensionPixelSize3 = getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480537a31);
        java.lang.String[] strArr = f142521i;
        java.lang.String str = strArr[0];
        java.lang.String[] strArr2 = f142522m;
        a(com.tencent.mm.R.id.cyl, str, strArr2[0], dimensionPixelSize);
        a(com.tencent.mm.R.id.cyr, strArr[1], strArr2[1], dimensionPixelSize);
        a(com.tencent.mm.R.id.cyq, strArr[2], strArr2[2], dimensionPixelSize);
        a(com.tencent.mm.R.id.cyj, strArr[3], strArr2[3], dimensionPixelSize);
        a(com.tencent.mm.R.id.cyi, strArr[4], strArr2[4], dimensionPixelSize);
        a(com.tencent.mm.R.id.cyo, strArr[5], strArr2[5], dimensionPixelSize);
        a(com.tencent.mm.R.id.cym, strArr[6], strArr2[6], dimensionPixelSize);
        a(com.tencent.mm.R.id.cyh, strArr[7], strArr2[7], dimensionPixelSize);
        a(com.tencent.mm.R.id.cyk, strArr[8], strArr2[8], dimensionPixelSize);
        a(com.tencent.mm.R.id.cyp, strArr[9], strArr2[9], dimensionPixelSize3);
        a(com.tencent.mm.R.id.cys, strArr[10], strArr2[10], dimensionPixelSize);
        a(com.tencent.mm.R.id.cyn, strArr[11], strArr2[11], dimensionPixelSize2);
        hashMap.put(java.lang.Integer.valueOf(com.tencent.mm.R.id.d1q), findViewById(com.tencent.mm.R.id.d1q));
        hashMap.put(java.lang.Integer.valueOf(com.tencent.mm.R.id.d1w), findViewById(com.tencent.mm.R.id.d1w));
        hashMap.put(java.lang.Integer.valueOf(com.tencent.mm.R.id.d1u), findViewById(com.tencent.mm.R.id.d1u));
        hashMap.put(java.lang.Integer.valueOf(com.tencent.mm.R.id.d1k), findViewById(com.tencent.mm.R.id.d1k));
        hashMap.put(java.lang.Integer.valueOf(com.tencent.mm.R.id.d1j), findViewById(com.tencent.mm.R.id.d1j));
        for (android.view.View view : hashMap.values()) {
            if (this.f142523d) {
                view.setBackgroundDrawable(getResources().getDrawable(com.tencent.mm.R.color.a8h));
            } else {
                view.setBackgroundDrawable(getResources().getDrawable(com.tencent.mm.R.color.f478887jx));
            }
        }
        setClipToPadding(false);
        setClipChildren(false);
    }

    public final void a(int i17, java.lang.String str, java.lang.String str2, float f17) {
        com.tencent.mm.plugin.ipcall.ui.DialNumberButton dialNumberButton = (com.tencent.mm.plugin.ipcall.ui.DialNumberButton) findViewById(i17);
        dialNumberButton.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.length() == 1) {
            dialNumberButton.f142519d.setText(str);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) || "1".equals(str)) {
            dialNumberButton.f142520e.setText(str2);
            dialNumberButton.f142520e.setVisibility(0);
        } else {
            dialNumberButton.f142520e.setVisibility(8);
        }
        dialNumberButton.f142519d.setTextSize(0, f17);
        dialNumberButton.setOnClickListener(this);
        dialNumberButton.setOnLongClickListener(this);
        dialNumberButton.setInTalkUIMode(this.f142523d);
        this.f142524e.put(java.lang.Integer.valueOf(i17), dialNumberButton);
        this.f142525f.put(str, dialNumberButton);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r7) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/ipcall/ui/DialPad"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            java.util.Map r0 = r6.f142524e
            int r1 = r7.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto Ld0
            java.util.Map r0 = r6.f142524e
            int r7 = r7.getId()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r7 = r0.get(r7)
            com.tencent.mm.plugin.ipcall.ui.DialNumberButton r7 = (com.tencent.mm.plugin.ipcall.ui.DialNumberButton) r7
            java.lang.String r0 = r7.getNumberText()
            java.lang.String r7 = r7.getOtherText()
            com.tencent.mm.plugin.ipcall.model.r r1 = com.tencent.mm.plugin.ipcall.model.r.Bi()
            wq4.c r1 = r1.f142514r
            if (r1 != 0) goto L5c
            com.tencent.mm.plugin.ipcall.model.r r1 = com.tencent.mm.plugin.ipcall.model.r.Bi()
            wq4.c r2 = new wq4.c
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r2.<init>(r3)
            r1.f142514r = r2
        L5c:
            com.tencent.mm.plugin.ipcall.model.r r1 = com.tencent.mm.plugin.ipcall.model.r.Bi()
            wq4.c r1 = r1.f142514r
            r1.getClass()
            r2 = -1
            if (r0 == 0) goto L84
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L71
            goto L84
        L71:
            java.util.HashMap r3 = wq4.c.f448616c
            boolean r4 = r3.containsKey(r0)
            if (r4 == 0) goto L84
            java.lang.Object r3 = r3.get(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L85
        L84:
            r3 = r2
        L85:
            if (r3 != r2) goto L88
            goto Lc1
        L88:
            android.content.Context r2 = wq4.c.f448617d
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r4 = "dtmf_tone"
            r5 = 1
            int r2 = android.provider.Settings.System.getInt(r2, r4, r5)
            if (r2 != r5) goto L99
            r2 = r5
            goto L9a
        L99:
            r2 = 0
        L9a:
            if (r2 != 0) goto L9d
            goto Lc1
        L9d:
            xm1.h r2 = ym1.f.wi()
            android.media.AudioManager r2 = r2.c()
            int r2 = r2.getRingerMode()
            if (r2 == 0) goto Lc1
            if (r2 != r5) goto Lae
            goto Lc1
        Lae:
            java.lang.Object r2 = r1.f448618a
            monitor-enter(r2)
            android.media.ToneGenerator r1 = r1.f448619b     // Catch: java.lang.Throwable -> Lbe
            if (r1 != 0) goto Lb7
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lbe
            goto Lc1
        Lb7:
            r4 = 250(0xfa, float:3.5E-43)
            r1.startTone(r3, r4)     // Catch: java.lang.Throwable -> Lbe
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lbe
            goto Lc1
        Lbe:
            r7 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lbe
            throw r7
        Lc1:
            com.tencent.mm.plugin.ipcall.ui.b r1 = r6.f142527h
            if (r1 == 0) goto Ld0
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r2 != 0) goto Lcc
            goto Lcd
        Lcc:
            r0 = r7
        Lcd:
            r1.a(r0)
        Ld0:
            java.lang.String r7 = "com/tencent/mm/plugin/ipcall/ui/DialPad"
            java.lang.String r0 = "android/view/View$OnClickListener"
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "(Landroid/view/View;)V"
            yj0.a.h(r6, r7, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ipcall.ui.DialPad.onClick(android.view.View):void");
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/DialPad", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.util.Map map = this.f142524e;
        if (!((java.util.HashMap) map).containsKey(java.lang.Integer.valueOf(view.getId()))) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/ipcall/ui/DialPad", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        com.tencent.mm.plugin.ipcall.ui.DialNumberButton dialNumberButton = (com.tencent.mm.plugin.ipcall.ui.DialNumberButton) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(view.getId()));
        java.lang.String numberText = dialNumberButton.getNumberText();
        java.lang.String otherText = dialNumberButton.getOtherText();
        com.tencent.mm.plugin.ipcall.ui.b bVar = this.f142527h;
        if (bVar != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(numberText)) {
                numberText = otherText;
            }
            bVar.b(numberText);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/ipcall/ui/DialPad", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DialPad", "onViewAdded, class: %s", view.getClass().getSimpleName());
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DialPad", "onViewRemoved, class: %s", view.getClass().getSimpleName());
    }

    public void setDialButtonClickListener(com.tencent.mm.plugin.ipcall.ui.b bVar) {
        this.f142527h = bVar;
    }

    public void setTalkUIMode(boolean z17) {
        this.f142523d = z17;
        java.util.Iterator it = ((java.util.HashMap) this.f142524e).values().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.ipcall.ui.DialNumberButton) it.next()).setInTalkUIMode(z17);
        }
        for (android.view.View view : ((java.util.HashMap) this.f142526g).values()) {
            if (this.f142523d) {
                view.setBackgroundDrawable(getResources().getDrawable(com.tencent.mm.R.color.a8h));
            } else {
                view.setBackgroundDrawable(getResources().getDrawable(com.tencent.mm.R.color.f478887jx));
            }
        }
    }
}
