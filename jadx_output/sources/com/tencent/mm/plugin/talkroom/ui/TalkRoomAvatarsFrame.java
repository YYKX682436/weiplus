package com.tencent.mm.plugin.talkroom.ui;

/* loaded from: classes15.dex */
public class TalkRoomAvatarsFrame extends android.widget.FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f172449m = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f172450d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMHorList f172451e;

    /* renamed from: f, reason: collision with root package name */
    public fh4.g f172452f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f172453g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f172454h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f172455i;

    public TalkRoomAvatarsFrame(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f172450d = i65.a.b(null, 58);
        b();
    }

    public final void a() {
        fh4.g gVar = this.f172452f;
        java.lang.String str = this.f172455i;
        gVar.f262696f = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f172452f.notifyDataSetChanged();
            return;
        }
        if (this.f172451e.getIsTouching()) {
            return;
        }
        fh4.g gVar2 = this.f172452f;
        int indexOf = gVar2.f262694d.indexOf(this.f172455i);
        int i17 = this.f172450d;
        int i18 = indexOf * i17;
        int currentPosition = this.f172451e.getCurrentPosition();
        if (i18 < currentPosition) {
            this.f172451e.c(i18);
        } else if (i18 > currentPosition + (i17 * 4)) {
            this.f172451e.c(i18 - (i17 * 4));
        } else {
            this.f172452f.notifyDataSetChanged();
        }
    }

    public final void b() {
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.cxo, this);
        com.tencent.mm.ui.base.MMHorList mMHorList = (com.tencent.mm.ui.base.MMHorList) findViewById(com.tencent.mm.R.id.f485249h13);
        this.f172451e = mMHorList;
        mMHorList.setOverScrollEnabled(true);
        this.f172451e.setCenterInParent(true);
        this.f172451e.setItemWidth(this.f172450d);
        fh4.g gVar = new fh4.g(getContext());
        this.f172452f = gVar;
        this.f172451e.setAdapter((android.widget.ListAdapter) gVar);
        this.f172453g = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f172451e.setHorListLitener(new fh4.d(this));
        this.f172454h = new com.tencent.mm.sdk.platformtools.b4(new fh4.e(this), false);
    }

    public void setCurMemeber(java.lang.String str) {
        if (this.f172451e == null) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f172455i) && com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f172455i) || !this.f172455i.equals(str)) {
            this.f172455i = str;
            a();
        }
    }

    public void setMembersList(java.util.List<java.lang.String> list) {
        fh4.g gVar = this.f172452f;
        if (gVar == null) {
            return;
        }
        if (list == null) {
            gVar.f262694d.clear();
        } else {
            gVar.f262694d = list;
        }
        gVar.notifyDataSetChanged();
    }

    public TalkRoomAvatarsFrame(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f172450d = i65.a.b(null, 58);
        b();
    }
}
