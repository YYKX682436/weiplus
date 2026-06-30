package com.tencent.mm.plugin.subapp.ui.openapi;

/* loaded from: classes8.dex */
public class AppPreference extends com.tencent.mm.ui.base.preference.Preference {
    public final android.content.Context L;
    public fg4.e M;
    public android.widget.AdapterView.OnItemClickListener N;
    public android.widget.AdapterView.OnItemClickListener P;
    public int Q;
    public final int R;
    public final boolean S;
    public final int T;

    public AppPreference(android.content.Context context) {
        this(context, null);
    }

    public com.tencent.mm.pluginsdk.model.app.m M(int i17) {
        if (i17 < 0 || i17 >= this.M.getCount()) {
            return null;
        }
        return (com.tencent.mm.pluginsdk.model.app.m) this.M.getItem(i17);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        com.tencent.mm.ui.base.MMGridView mMGridView = (com.tencent.mm.ui.base.MMGridView) view.findViewById(com.tencent.mm.R.id.gts);
        fg4.e eVar = new fg4.e(this.L, this.Q);
        this.M = eVar;
        mMGridView.setAdapter((android.widget.ListAdapter) eVar);
        mMGridView.setOnItemClickListener(new fg4.g(this));
        if (this.S) {
            mMGridView.setOnItemLongClickListener(new fg4.h(this));
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484228dg2);
        if (this.M.getCount() == 0) {
            textView.setVisibility(0);
            textView.setText(this.T);
            mMGridView.setVisibility(8);
        } else {
            textView.setVisibility(8);
            mMGridView.setVisibility(0);
        }
        android.widget.Button button = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.azj);
        button.setVisibility(this.R);
        button.setOnClickListener(null);
    }

    public AppPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.N = null;
        this.P = null;
        this.Q = 0;
        this.S = false;
        this.T = 0;
        this.L = context;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rj.t.f396152b);
        this.R = obtainStyledAttributes.getInt(0, 8);
        this.S = obtainStyledAttributes.getBoolean(1, false);
        this.T = obtainStyledAttributes.getResourceId(2, 0);
        obtainStyledAttributes.recycle();
    }
}
