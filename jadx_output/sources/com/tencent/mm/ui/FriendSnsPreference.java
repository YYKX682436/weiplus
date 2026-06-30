package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public final class FriendSnsPreference extends com.tencent.mm.ui.base.preference.IconPreference {
    public java.lang.String Y1;
    public long Z1;

    public FriendSnsPreference(android.content.Context context) {
        this(context, null);
    }

    public void h0(java.lang.String str) {
        this.Q = -1;
        this.Y1 = str;
        this.Z1 = 0L;
        if (this.S != null) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.S, str, null);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.IconPreference, com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        if (this.Y1 != null && gm0.j1.a()) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.S, this.Y1, null);
        }
        if (this.Z1 == 0 || this.S == null) {
            return;
        }
        ((n34.v4) ((p94.s0) i95.n0.c(p94.s0.class))).Bi(this.Z1, this.S, this.f197770d.hashCode());
    }

    public FriendSnsPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FriendSnsPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.Y1 = null;
    }
}
