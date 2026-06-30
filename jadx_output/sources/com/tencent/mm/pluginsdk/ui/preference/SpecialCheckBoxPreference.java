package com.tencent.mm.pluginsdk.ui.preference;

/* loaded from: classes11.dex */
public class SpecialCheckBoxPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.ToggleButton L;
    public android.widget.ToggleButton M;
    public android.widget.ToggleButton N;
    public com.tencent.mm.storage.z3 P;
    public final android.content.Context Q;
    public java.lang.String R;
    public boolean S;
    public boolean T;
    public final android.widget.CompoundButton.OnCheckedChangeListener U;
    public boolean V;

    public SpecialCheckBoxPreference(android.content.Context context) {
        super(context);
        this.U = new y35.f0(this);
        this.V = false;
        this.Q = context;
    }

    public final boolean M() {
        if (this.S) {
            this.V = this.P.T == 0;
        } else if (!this.T) {
            this.V = c01.e2.P(this.P);
        }
        android.content.Context context = this.Q;
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            if (this.V) {
                ((com.tencent.mm.ui.MMActivity) context).setTitleMuteIconVisibility(0);
                return true;
            }
            ((com.tencent.mm.ui.MMActivity) context).setTitleMuteIconVisibility(8);
        }
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        this.L = (android.widget.ToggleButton) view.findViewById(com.tencent.mm.R.id.m78);
        this.M = (android.widget.ToggleButton) view.findViewById(com.tencent.mm.R.id.m77);
        this.N = (android.widget.ToggleButton) view.findViewById(com.tencent.mm.R.id.m79);
        android.content.Context context = this.Q;
        this.R = ((com.tencent.mm.ui.MMActivity) context).getIntent().getStringExtra("RoomInfo_Id");
        this.S = ((com.tencent.mm.ui.MMActivity) context).getIntent().getBooleanExtra("Is_Chatroom", true);
        this.T = ((com.tencent.mm.ui.MMActivity) context).getIntent().getBooleanExtra("Is_Lbsroom", false);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.R, true);
        this.P = n17;
        if (n17 != null) {
            this.L.setChecked(((com.tencent.mm.storage.m4) c01.d9.b().r()).K(this.P.d1()));
            this.N.setChecked(this.P.r2());
            this.M.setChecked(M());
        }
        android.widget.ToggleButton toggleButton = this.L;
        android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.U;
        toggleButton.setOnCheckedChangeListener(onCheckedChangeListener);
        this.M.setOnCheckedChangeListener(onCheckedChangeListener);
        this.N.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public SpecialCheckBoxPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U = new y35.f0(this);
        this.V = false;
        this.Q = context;
    }

    public SpecialCheckBoxPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.U = new y35.f0(this);
        this.V = false;
        this.Q = context;
    }
}
