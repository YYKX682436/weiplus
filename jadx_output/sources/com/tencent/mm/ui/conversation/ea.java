package com.tencent.mm.ui.conversation;

/* loaded from: classes.dex */
public abstract class ea {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.ui.widget.dialog.j0 f207655a;

    public static void a(android.content.Context context) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("show_rating_preferences", 0);
        int i17 = sharedPreferences.getInt("show_rating_wait_days", 0);
        int i18 = sharedPreferences.getInt("show_rating_first_second_time", 0);
        f207655a = db5.e1.K(context, false, context.getString(com.tencent.mm.R.string.j57), "", context.getString(com.tencent.mm.R.string.f493158j56), context.getString(com.tencent.mm.R.string.f493157j55), new com.tencent.mm.ui.conversation.ca(sharedPreferences, context, i18, i17), new com.tencent.mm.ui.conversation.da(sharedPreferences, i18, i17));
    }

    public static void b(android.content.Context context, boolean z17) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("show_rating_preferences", 0);
        boolean z18 = sharedPreferences.getBoolean("show_rating_again", false);
        int i17 = sharedPreferences.getInt("show_rating_wait_days", 0);
        int i18 = sharedPreferences.getInt("show_rating_first_second_time", 0);
        if (z17) {
            string = context.getString(com.tencent.mm.R.string.f493155j53);
            string2 = context.getString(com.tencent.mm.R.string.f493154j52);
            string3 = context.getString(com.tencent.mm.R.string.f493153j51);
        } else {
            string = context.getString(com.tencent.mm.R.string.f493152j50);
            string2 = context.getString(com.tencent.mm.R.string.j4z);
            string3 = context.getString(com.tencent.mm.R.string.j4y);
        }
        f207655a = db5.e1.K(context, false, string, "", string2, string3, new com.tencent.mm.ui.conversation.aa(sharedPreferences, context, z18, i18, i17), new com.tencent.mm.ui.conversation.ba(sharedPreferences, z18, i18, i17));
    }
}
